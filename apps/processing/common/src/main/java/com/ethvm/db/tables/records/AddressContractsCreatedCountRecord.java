/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.AddressContractsCreatedCount;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AddressContractsCreatedCountRecord extends UpdatableRecordImpl<AddressContractsCreatedCountRecord> implements Record3<String, Long, BigDecimal> {

    private static final long serialVersionUID = 792776450;

    /**
     * Setter for <code>public.address_contracts_created_count.address</code>.
     */
    public AddressContractsCreatedCountRecord setAddress(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.address_contracts_created_count.address</code>.
     */
    public String getAddress() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.address_contracts_created_count.total</code>.
     */
    public AddressContractsCreatedCountRecord setTotal(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.address_contracts_created_count.total</code>.
     */
    public Long getTotal() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.address_contracts_created_count.block_number</code>.
     */
    public AddressContractsCreatedCountRecord setBlockNumber(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.address_contracts_created_count.block_number</code>.
     */
    public BigDecimal getBlockNumber() {
        return (BigDecimal) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, BigDecimal> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Long, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Long, BigDecimal> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return AddressContractsCreatedCount.ADDRESS_CONTRACTS_CREATED_COUNT.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return AddressContractsCreatedCount.ADDRESS_CONTRACTS_CREATED_COUNT.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return AddressContractsCreatedCount.ADDRESS_CONTRACTS_CREATED_COUNT.BLOCK_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getBlockNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getBlockNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressContractsCreatedCountRecord value1(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressContractsCreatedCountRecord value2(Long value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressContractsCreatedCountRecord value3(BigDecimal value) {
        setBlockNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressContractsCreatedCountRecord values(String value1, Long value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AddressContractsCreatedCountRecord
     */
    public AddressContractsCreatedCountRecord() {
        super(AddressContractsCreatedCount.ADDRESS_CONTRACTS_CREATED_COUNT);
    }

    /**
     * Create a detached, initialised AddressContractsCreatedCountRecord
     */
    public AddressContractsCreatedCountRecord(String address, Long total, BigDecimal blockNumber) {
        super(AddressContractsCreatedCount.ADDRESS_CONTRACTS_CREATED_COUNT);

        set(0, address);
        set(1, total);
        set(2, blockNumber);
    }
}
