package com.concord.task.model.service;

public interface AES256Service {
    Object encrypt(Object in);

    Object decrypt(Object in);
}
