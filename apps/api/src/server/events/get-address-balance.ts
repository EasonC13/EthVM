import { removePrefix } from '@app/server/core/utils'
import { balancePayloadValidator } from '@app/server/core/validation'
import { EthVMServer, SocketEvent, SocketEventValidationResult } from '@app/server/ethvm-server'
import { AddressBalance, Events } from 'ethvm-common'

const getAddressBalance: SocketEvent = {
  id: Events.getAddressBalance,
  onValidate: (server: EthVMServer, socket: SocketIO.Socket, payload: any): SocketEventValidationResult => {
    const valid = balancePayloadValidator(payload) as boolean
    return {
      valid,
      errors: [] // TODO: Map properly the error
    }
  },

  onEvent: (server: EthVMServer, socket: SocketIO.Socket, payload: any): Promise<AddressBalance | null> =>
    server.balancesService.getAddressBalance(removePrefix(payload.address))
}

export default getAddressBalance
