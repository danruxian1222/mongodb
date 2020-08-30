package com.cmb.warn.service.impl;

import com.cmb.warn.nosql.mongodb.document.FileOperationHistory;
import com.cmb.warn.nosql.mongodb.repository.FileOperationHistoryRepository;
import com.cmb.warn.service.FileOperationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileOperationHistoryServiceImpl implements FileOperationHistoryService {

    @Autowired
    private FileOperationHistoryRepository fileOperationHistoryRepository;

    @Override
    public List<FileOperationHistory> list(String fileName) {
        return fileOperationHistoryRepository.findByFileName(fileName);
    }
}
