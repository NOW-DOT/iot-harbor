package com.iot.protocol.mqtt;

import com.iot.common.Qos;
import com.iot.common.connection.ServerConnection;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;

public class MqttServerConnection implements ServerConnection {




    @Override
    public Mono<Disposable> close() {
        return null;
    }

    @Override
    public Mono<Void> pub(String topic, String message) {
        return null;
    }

    @Override
    public Mono<Void> pub(String topic, String message, Qos qos) {
        return null;
    }


}
