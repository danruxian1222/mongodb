package com.cmb.warn.service;

import com.cmb.warn.nosql.mongodb.document.FileOperationHistory;

import java.util.List;

public interface FileOperationHistoryService {
    List<FileOperationHistory> list(String fileName);
}
