package com.concord.task.controller;

import com.concord.task.model.dto.RequestBodyDTO;
import com.concord.task.model.service.ConcordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ConcordController {
    private final ConcordService concordService;

    @PostMapping("/encryption")
    public Object encryption(@RequestBody RequestBodyDTO requestBodyDTO) {
        int validatedId = "1".equals(requestBodyDTO.getId()) ? 1 : 0;
        return concordService.encryption(validatedId);
    }
}
