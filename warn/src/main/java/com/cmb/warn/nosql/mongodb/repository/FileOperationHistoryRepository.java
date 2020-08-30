package com.cmb.warn.nosql.mongodb.repository;

import com.cmb.warn.nosql.mongodb.document.FileOperationHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FileOperationHistoryRepository extends MongoRepository<FileOperationHistory,String> {
    List<FileOperationHistory> findByFileName(String fileName);
}
