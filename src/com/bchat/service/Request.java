/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.bchat.service;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-2")
public class Request implements org.apache.thrift.TBase<Request, Request._Fields>, java.io.Serializable, Cloneable, Comparable<Request> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Request");

  private static final org.apache.thrift.protocol.TField REQUEST_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("requestCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("sender", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField RECEIVER_FIELD_DESC = new org.apache.thrift.protocol.TField("receiver", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RequestTupleSchemeFactory());
  }

  public int requestCode; // required
  public Account sender; // required
  public String receiver; // required
  public String message; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUEST_CODE((short)1, "requestCode"),
    SENDER((short)2, "sender"),
    RECEIVER((short)3, "receiver"),
    MESSAGE((short)4, "message");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // REQUEST_CODE
          return REQUEST_CODE;
        case 2: // SENDER
          return SENDER;
        case 3: // RECEIVER
          return RECEIVER;
        case 4: // MESSAGE
          return MESSAGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __REQUESTCODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQUEST_CODE, new org.apache.thrift.meta_data.FieldMetaData("requestCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SENDER, new org.apache.thrift.meta_data.FieldMetaData("sender", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Account.class)));
    tmpMap.put(_Fields.RECEIVER, new org.apache.thrift.meta_data.FieldMetaData("receiver", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Request.class, metaDataMap);
  }

  public Request() {
  }

  public Request(
    int requestCode,
    Account sender,
    String receiver,
    String message)
  {
    this();
    this.requestCode = requestCode;
    setRequestCodeIsSet(true);
    this.sender = sender;
    this.receiver = receiver;
    this.message = message;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Request(Request other) {
    __isset_bitfield = other.__isset_bitfield;
    this.requestCode = other.requestCode;
    if (other.isSetSender()) {
      this.sender = new Account(other.sender);
    }
    if (other.isSetReceiver()) {
      this.receiver = other.receiver;
    }
    if (other.isSetMessage()) {
      this.message = other.message;
    }
  }

  public Request deepCopy() {
    return new Request(this);
  }

  @Override
  public void clear() {
    setRequestCodeIsSet(false);
    this.requestCode = 0;
    this.sender = null;
    this.receiver = null;
    this.message = null;
  }

  public int getRequestCode() {
    return this.requestCode;
  }

  public Request setRequestCode(int requestCode) {
    this.requestCode = requestCode;
    setRequestCodeIsSet(true);
    return this;
  }

  public void unsetRequestCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REQUESTCODE_ISSET_ID);
  }

  /** Returns true if field requestCode is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestCode() {
    return EncodingUtils.testBit(__isset_bitfield, __REQUESTCODE_ISSET_ID);
  }

  public void setRequestCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REQUESTCODE_ISSET_ID, value);
  }

  public Account getSender() {
    return this.sender;
  }

  public Request setSender(Account sender) {
    this.sender = sender;
    return this;
  }

  public void unsetSender() {
    this.sender = null;
  }

  /** Returns true if field sender is set (has been assigned a value) and false otherwise */
  public boolean isSetSender() {
    return this.sender != null;
  }

  public void setSenderIsSet(boolean value) {
    if (!value) {
      this.sender = null;
    }
  }

  public String getReceiver() {
    return this.receiver;
  }

  public Request setReceiver(String receiver) {
    this.receiver = receiver;
    return this;
  }

  public void unsetReceiver() {
    this.receiver = null;
  }

  /** Returns true if field receiver is set (has been assigned a value) and false otherwise */
  public boolean isSetReceiver() {
    return this.receiver != null;
  }

  public void setReceiverIsSet(boolean value) {
    if (!value) {
      this.receiver = null;
    }
  }

  public String getMessage() {
    return this.message;
  }

  public Request setMessage(String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQUEST_CODE:
      if (value == null) {
        unsetRequestCode();
      } else {
        setRequestCode((Integer)value);
      }
      break;

    case SENDER:
      if (value == null) {
        unsetSender();
      } else {
        setSender((Account)value);
      }
      break;

    case RECEIVER:
      if (value == null) {
        unsetReceiver();
      } else {
        setReceiver((String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUEST_CODE:
      return Integer.valueOf(getRequestCode());

    case SENDER:
      return getSender();

    case RECEIVER:
      return getReceiver();

    case MESSAGE:
      return getMessage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQUEST_CODE:
      return isSetRequestCode();
    case SENDER:
      return isSetSender();
    case RECEIVER:
      return isSetReceiver();
    case MESSAGE:
      return isSetMessage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Request)
      return this.equals((Request)that);
    return false;
  }

  public boolean equals(Request that) {
    if (that == null)
      return false;

    boolean this_present_requestCode = true;
    boolean that_present_requestCode = true;
    if (this_present_requestCode || that_present_requestCode) {
      if (!(this_present_requestCode && that_present_requestCode))
        return false;
      if (this.requestCode != that.requestCode)
        return false;
    }

    boolean this_present_sender = true && this.isSetSender();
    boolean that_present_sender = true && that.isSetSender();
    if (this_present_sender || that_present_sender) {
      if (!(this_present_sender && that_present_sender))
        return false;
      if (!this.sender.equals(that.sender))
        return false;
    }

    boolean this_present_receiver = true && this.isSetReceiver();
    boolean that_present_receiver = true && that.isSetReceiver();
    if (this_present_receiver || that_present_receiver) {
      if (!(this_present_receiver && that_present_receiver))
        return false;
      if (!this.receiver.equals(that.receiver))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_requestCode = true;
    list.add(present_requestCode);
    if (present_requestCode)
      list.add(requestCode);

    boolean present_sender = true && (isSetSender());
    list.add(present_sender);
    if (present_sender)
      list.add(sender);

    boolean present_receiver = true && (isSetReceiver());
    list.add(present_receiver);
    if (present_receiver)
      list.add(receiver);

    boolean present_message = true && (isSetMessage());
    list.add(present_message);
    if (present_message)
      list.add(message);

    return list.hashCode();
  }

  @Override
  public int compareTo(Request other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRequestCode()).compareTo(other.isSetRequestCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestCode, other.requestCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSender()).compareTo(other.isSetSender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sender, other.sender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReceiver()).compareTo(other.isSetReceiver());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceiver()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.receiver, other.receiver);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Request(");
    boolean first = true;

    sb.append("requestCode:");
    sb.append(this.requestCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sender:");
    if (this.sender == null) {
      sb.append("null");
    } else {
      sb.append(this.sender);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("receiver:");
    if (this.receiver == null) {
      sb.append("null");
    } else {
      sb.append(this.receiver);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (sender != null) {
      sender.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RequestStandardSchemeFactory implements SchemeFactory {
    public RequestStandardScheme getScheme() {
      return new RequestStandardScheme();
    }
  }

  private static class RequestStandardScheme extends StandardScheme<Request> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Request struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQUEST_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.requestCode = iprot.readI32();
              struct.setRequestCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sender = new Account();
              struct.sender.read(iprot);
              struct.setSenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RECEIVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.receiver = iprot.readString();
              struct.setReceiverIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Request struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REQUEST_CODE_FIELD_DESC);
      oprot.writeI32(struct.requestCode);
      oprot.writeFieldEnd();
      if (struct.sender != null) {
        oprot.writeFieldBegin(SENDER_FIELD_DESC);
        struct.sender.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.receiver != null) {
        oprot.writeFieldBegin(RECEIVER_FIELD_DESC);
        oprot.writeString(struct.receiver);
        oprot.writeFieldEnd();
      }
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(struct.message);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RequestTupleSchemeFactory implements SchemeFactory {
    public RequestTupleScheme getScheme() {
      return new RequestTupleScheme();
    }
  }

  private static class RequestTupleScheme extends TupleScheme<Request> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRequestCode()) {
        optionals.set(0);
      }
      if (struct.isSetSender()) {
        optionals.set(1);
      }
      if (struct.isSetReceiver()) {
        optionals.set(2);
      }
      if (struct.isSetMessage()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetRequestCode()) {
        oprot.writeI32(struct.requestCode);
      }
      if (struct.isSetSender()) {
        struct.sender.write(oprot);
      }
      if (struct.isSetReceiver()) {
        oprot.writeString(struct.receiver);
      }
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.requestCode = iprot.readI32();
        struct.setRequestCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sender = new Account();
        struct.sender.read(iprot);
        struct.setSenderIsSet(true);
      }
      if (incoming.get(2)) {
        struct.receiver = iprot.readString();
        struct.setReceiverIsSet(true);
      }
      if (incoming.get(3)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
    }
  }

}
