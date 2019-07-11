package com.iot.common.connection;


import com.iot.common.Qos;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;

public interface ServerConnection {

    Mono<Disposable> close();

    Mono<Void> pub(String topic,String message);

    Mono<Void> pub(String topic, String message, Qos qos);




}
