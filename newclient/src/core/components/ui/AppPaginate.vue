<template>
    <v-card color="transparent" flat max-width="340">
        <v-container grid-list-xs pa-1>
            <v-layout row align-center justify-end fill-height>
                <v-btn v-if="hasFirst" flat class="bttnGrey info--text text-capitalize bttn" small @click="setPageOnClick('first')">{{
                    $t('btn.first')
                }}</v-btn>
                <v-btn :disabled="currentPage === 0" flat class="bttnGrey info--text text-capitalize bttn" small @click="setPageOnClick('prev')"
                    ><v-icon class="secondary--text" small>fas fa-angle-left</v-icon>
                </v-btn>
                <div v-if="hasInput" class="page-input">
                    <v-text-field v-model="pageDisplay" :mask="inputMask" :placeholder="pageDisplay" :error="!isValidPageDisplay" :class="validClass" />
                </div>

                <p class="info--text text-center">{{ showText }}</p>
                <v-btn :disabled="currentPage === lastPage" flat class="bttnGrey info--text text-capitalize bttn" small @click="setPageOnClick('next')"
                    ><v-icon class="secondary--text" small>fas fa-angle-right</v-icon>
                </v-btn>
                <v-btn v-if="hasLast" flat class="bttnGrey info--text text-capitalize bttn" small @click="setPageOnClick('last')">{{ $t('btn.last') }}</v-btn>
            </v-layout>
        </v-container>
    </v-card>
</template>

<script lang="ts">
import { Component, Prop, Mixins } from 'vue-property-decorator'
import { NumberFormatMixin } from '@app/core/components/mixins/number-format.mixin'
import BigNumber from 'bignumber.js'

@Component
export default class AppPaginate extends Mixins(NumberFormatMixin) {
    /*
  ===================================================================================
    Props
  ===================================================================================
  */

    @Prop(Number) total!: number
    @Prop(Number) currentPage!: number
    @Prop({ type: Boolean, default: true }) hasFirst!: boolean
    @Prop({ type: Boolean, default: true }) hasLast!: boolean
    @Prop({ type: Boolean, default: true }) hasInput!: boolean

    /*
  ===================================================================================
    Initial Data
  ===================================================================================
  */

    validClass = 'center-input body-1 secondary--text'
    invalidClass = 'center-input body-1 error--text'
    isError = false
    pageDisplayUpdateTimeout: number | null = null // Timeout object to update page with override of pageDisplay input model

    /*
  ===================================================================================
    Methods
  ===================================================================================
  */

    /**
     * Emit event to parent compoent/view with updated page number.
     *
     * @param  {Number} - Page to emit to parent
     */
    emitNewPage(page: number) {
        this.$emit('newPage', page)
    }

    /**
     * If desired page is within valid page range, emit new page.
     *
     * @param {Number} page - Desired page to traverse
     */
    setPage(page: number) {
        if (this.isValidPage(page) && page !== this.currentPage) {
            this.emitNewPage(page)
        }
    }

    /**
     * On pagination button click, emit updated page number to parent component/view
     *
     * @param {String} value - Name of action to perform
     */
    setPageOnClick(value: string): void {
        switch (value) {
            case 'first':
                this.emitNewPage(0)
                break
            case 'prev':
                this.emitNewPage(Math.max(0, this.currentPage - 1))
                break
            case 'next':
                this.emitNewPage(Math.min(this.lastPage, this.currentPage + 1))
                break
            case 'last':
                this.emitNewPage(this.lastPage)
                break
            default:
                break
        }
    }

    /**
     * Determine if an given @number is within the valid page range.
     *
     * @page {Number} - Page number to be validated
     * @return {Boolean}
     */
    isValidPage(page: number): boolean {
        return page >= 0 && page <= this.lastPage
    }

    /*
  ===================================================================================
    Set Values
  ===================================================================================
  */

    set pageDisplay(pageDisplay: string) {
        const desiredPage = parseInt(pageDisplay, 10) - 1
        ;(desiredPage >= 0 && desiredPage <= this.lastPage) || !pageDisplay ? (this.isError = false) : (this.isError = true)
        if (this.pageDisplayUpdateTimeout) {
            clearTimeout(this.pageDisplayUpdateTimeout)
        }
        this.pageDisplayUpdateTimeout = window.setTimeout(() => {
            this.setPage(desiredPage)
        }, 1000)
    }

    /*
  ===================================================================================
    Computed Values
  ===================================================================================
  */

    /**
     * Transform the "zero-based" value of this.page into
     * a human-readable string that starts from 1 as opposed to 0
     */

    get showText(): string {
        return this.hasInput ? `${this.$t('message.page')} ${this.totalFormatted}` : `${this.pageDisplay} ${this.$t('message.page')} ${this.totalFormatted}`
    }
    get pageDisplay(): string {
        return new BigNumber(this.currentPage + 1).toFixed()
    }

    /**
     * Determine if an given @number is within the valid page range.
     *
     * @return {Boolean}
     */
    get isValidPageDisplay(): boolean {
        return !this.isError
    }

    get totalFormatted(): string {
        return this.formatIntegerValue(new BigNumber(this.total)).value
    }

    /**
     * Property this.total is a human-readable number/length as opposed to a zero-based number.
     * The last possible page is zero-based, so this translates the human-readable number into zero-based
     */
    get lastPage(): number {
        return this.total - 1
    }

    get inputMask(): string {
        let mask = '#'
        while (mask.length != this.total.toString().length) {
            mask += '#'
        }
        return mask
    }
}
</script>

<style scoped lang="css">
.v-btn {
    height: 30px;
    min-width: 20px;
    margin: 5px;
}

.page-input {
    width: 80px;
}

p {
    margin: 0;
    padding: 0;
}
</style>
