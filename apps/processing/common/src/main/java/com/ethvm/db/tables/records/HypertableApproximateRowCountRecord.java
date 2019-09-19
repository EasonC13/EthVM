/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.HypertableApproximateRowCount;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HypertableApproximateRowCountRecord extends TableRecordImpl<HypertableApproximateRowCountRecord> implements Record3<String, String, Long> {

    private static final long serialVersionUID = 1732011107;

    /**
     * Setter for <code>public.hypertable_approximate_row_count.schema_name</code>.
     */
    public HypertableApproximateRowCountRecord setSchemaName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.hypertable_approximate_row_count.schema_name</code>.
     */
    public String getSchemaName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.hypertable_approximate_row_count.table_name</code>.
     */
    public HypertableApproximateRowCountRecord setTableName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.hypertable_approximate_row_count.table_name</code>.
     */
    public String getTableName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.hypertable_approximate_row_count.row_estimate</code>.
     */
    public HypertableApproximateRowCountRecord setRowEstimate(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.hypertable_approximate_row_count.row_estimate</code>.
     */
    public Long getRowEstimate() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return HypertableApproximateRowCount.HYPERTABLE_APPROXIMATE_ROW_COUNT.SCHEMA_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return HypertableApproximateRowCount.HYPERTABLE_APPROXIMATE_ROW_COUNT.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return HypertableApproximateRowCount.HYPERTABLE_APPROXIMATE_ROW_COUNT.ROW_ESTIMATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSchemaName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getRowEstimate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSchemaName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getRowEstimate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HypertableApproximateRowCountRecord value1(String value) {
        setSchemaName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HypertableApproximateRowCountRecord value2(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HypertableApproximateRowCountRecord value3(Long value) {
        setRowEstimate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HypertableApproximateRowCountRecord values(String value1, String value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HypertableApproximateRowCountRecord
     */
    public HypertableApproximateRowCountRecord() {
        super(HypertableApproximateRowCount.HYPERTABLE_APPROXIMATE_ROW_COUNT);
    }

    /**
     * Create a detached, initialised HypertableApproximateRowCountRecord
     */
    public HypertableApproximateRowCountRecord(String schemaName, String tableName, Long rowEstimate) {
        super(HypertableApproximateRowCount.HYPERTABLE_APPROXIMATE_ROW_COUNT);

        set(0, schemaName);
        set(1, tableName);
        set(2, rowEstimate);
    }
}