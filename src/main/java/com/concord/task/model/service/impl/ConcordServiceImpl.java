/*
 * *************************************************************************
 * * Yaypay CONFIDENTIAL   2020
 * * All Rights Reserved. * *
 * NOTICE: All information contained herein is, and remains the property of Yaypay Incorporated and its suppliers, if any.
 * The intellectual and technical concepts contained  herein are proprietary to Yaypay Incorporated
 * and its suppliers and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material  is strictly forbidden unless prior written permission is obtained  from Yaypay Incorporated.
 */

package com.concord.task.model.service.impl;

import com.concord.task.model.dto.ResponseBodyDTO;
import com.concord.task.model.service.AES256Service;
import com.concord.task.model.service.ConcordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConcordServiceImpl implements ConcordService {
    public static final String NULL = "NULL";

    private AES256Service aes256Service = new AES256Service() {
        @Override
        public Object encrypt(Object in) {
            return "encrypted"; //stub
        }

        @Override
        public Object decrypt(Object in) {
            return "encrypted"; //stub
        }
    };

    public Object encryption(int id) {
        if (id == 1) {
            ResponseBodyDTO responseBodyDTO = new ResponseBodyDTO("fio", "Test Testov");
            log.debug("=== encryption: " + aes256Service.encrypt(id));
            log.debug("=== decryption: " + id);

            log.debug("=== encryption: " + aes256Service.encrypt(responseBodyDTO.toString()));
            log.debug("=== decryption: " + responseBodyDTO.toString());
            return responseBodyDTO;
        } else {
            return NULL;
        }
    }
}
