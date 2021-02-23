/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kit.datamanager.metastore2.dao;

import edu.kit.datamanager.metastore2.domain.DataRecord;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author Torridity
 */
public interface IDataRecordDao extends JpaRepository<DataRecord, String>, JpaSpecificationExecutor<DataRecord>{
  DataRecord findBySchemaIdAndVersion(String schemaId, Long version);
  List<DataRecord> findBySchemaIdOrderByVersionDesc(String schemaId);
  DataRecord findTopBySchemaIdOrderByVersionDesc(String schemaId);
}
