// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     device/battery/battery_monitor.mojom
//

package org.chromium.mojom.device;

class BatteryMonitor_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<BatteryMonitor, BatteryMonitor.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<BatteryMonitor, BatteryMonitor.Proxy>() {
    
        public String getName() {
            return "device::BatteryMonitor";
        }
    
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }
    
        public Stub buildStub(org.chromium.mojo.system.Core core, BatteryMonitor impl) {
            return new Stub(core, impl);
        }
    
        public BatteryMonitor[] buildArray(int size) {
          return new BatteryMonitor[size];
        }
    };

    private static final int QUERY_NEXT_STATUS_ORDINAL = 0;

    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements BatteryMonitor.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override
        public void queryNextStatus(QueryNextStatusResponse callback) {
            BatteryMonitorQueryNextStatusParams _message = new BatteryMonitorQueryNextStatusParams();
            getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    QUERY_NEXT_STATUS_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new BatteryMonitorQueryNextStatusResponseParamsForwardToCallback(callback));
        }

    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<BatteryMonitor> {

        Stub(org.chromium.mojo.system.Core core, BatteryMonitor impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            return false;
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
                    case QUERY_NEXT_STATUS_ORDINAL: {
                        BatteryMonitorQueryNextStatusParams.deserialize(messageWithHeader.getPayload());
                        getImpl().queryNextStatus(new BatteryMonitorQueryNextStatusResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static final class BatteryMonitorQueryNextStatusParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY = new DataHeader[] {new DataHeader(8, 0)};
        private static final DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    
        public BatteryMonitorQueryNextStatusParams() {
            super(STRUCT_SIZE);
        }
    
        public static BatteryMonitorQueryNextStatusParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        @SuppressWarnings("unchecked")
        public static BatteryMonitorQueryNextStatusParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            BatteryMonitorQueryNextStatusParams result = new BatteryMonitorQueryNextStatusParams();
            decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    
        /**
         * @see Object#equals(Object)
         */
        @Override
        public boolean equals(Object object) {
            if (object == this)
                return true;
            if (object == null)
                return false;
            if (getClass() != object.getClass())
                return false;
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            return result;
        }
    }

    static final class BatteryMonitorQueryNextStatusResponseParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY = new DataHeader[] {new DataHeader(16, 0)};
        private static final DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    
        public BatteryStatus status;
    
        public BatteryMonitorQueryNextStatusResponseParams() {
            super(STRUCT_SIZE);
        }
    
        public static BatteryMonitorQueryNextStatusResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        @SuppressWarnings("unchecked")
        public static BatteryMonitorQueryNextStatusResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            BatteryMonitorQueryNextStatusResponseParams result = new BatteryMonitorQueryNextStatusResponseParams();
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            if (mainDataHeader.elementsOrVersion >= 0) {
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.status = BatteryStatus.decode(decoder1);
            }
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(status, 8, false);
        }
    
        /**
         * @see Object#equals(Object)
         */
        @Override
        public boolean equals(Object object) {
            if (object == this)
                return true;
            if (object == null)
                return false;
            if (getClass() != object.getClass())
                return false;
            BatteryMonitorQueryNextStatusResponseParams other = (BatteryMonitorQueryNextStatusResponseParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(status, other.status))
                return false;
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(status);
            return result;
        }
    }

    static class BatteryMonitorQueryNextStatusResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final BatteryMonitor.QueryNextStatusResponse mCallback;

        BatteryMonitorQueryNextStatusResponseParamsForwardToCallback(BatteryMonitor.QueryNextStatusResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(QUERY_NEXT_STATUS_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }
                BatteryMonitorQueryNextStatusResponseParams response = BatteryMonitorQueryNextStatusResponseParams.deserialize(messageWithHeader.getPayload());
                mCallback.call(response.status);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class BatteryMonitorQueryNextStatusResponseParamsProxyToResponder implements BatteryMonitor.QueryNextStatusResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BatteryMonitorQueryNextStatusResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(BatteryStatus status) {
            BatteryMonitorQueryNextStatusResponseParams _response = new BatteryMonitorQueryNextStatusResponseParams();
            _response.status = status;
            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    QUERY_NEXT_STATUS_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }

}

