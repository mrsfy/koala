package com.koala.app.client.domain;

/**
 * Created by mrsfy on 22-Dec-16.
 */
public interface SocketListener<T> {

    void call(T res);

}