package org.hypertrace.core.viewgenerator;

import org.apache.avro.generic.GenericRecord;
import org.apache.avro.specific.SpecificRecord;

import java.util.List;

/**
 * The implementations are expected to be stateless.
 */
public interface JavaCodeBasedViewGenerator<IN extends SpecificRecord, OUT extends GenericRecord> extends ViewGenerator<OUT> {
  /**
   * List of GenericRecord's. Each Record should conform to getSchema() and will be inserted into
   * output sink's (Kafka)
   */
  List<OUT> process(IN trace);
}
