package net.mamoe.mirai.qqandroid.network.protocol.data.proto

import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoId
import net.mamoe.mirai.qqandroid.network.protocol.packet.EMPTY_BYTE_ARRAY
import net.mamoe.mirai.qqandroid.utils.io.ProtoBuf

internal class MsgTransmit : ProtoBuf {
    @Serializable
internal class PbMultiMsgItem(
        @ProtoId(1) val fileName: String = "",
        @ProtoId(2) val buffer: ByteArray = EMPTY_BYTE_ARRAY
    ) : ProtoBuf

    @Serializable
internal class PbMultiMsgNew(
        @ProtoId(1) val msg: List<MsgComm.Msg>? = null
    ) : ProtoBuf

    @Serializable
internal class PbMultiMsgTransmit(
        @ProtoId(1) val msg: List<MsgComm.Msg>? = null,
        @ProtoId(2) val pbItemList: List<MsgTransmit.PbMultiMsgItem>? = null
    ) : ProtoBuf
}