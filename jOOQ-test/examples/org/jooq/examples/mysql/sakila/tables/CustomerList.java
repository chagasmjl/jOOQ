/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class CustomerList extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord> {

	private static final long serialVersionUID = 429183358;

	/**
	 * The singleton instance of customer_list
	 */
	public static final org.jooq.examples.mysql.sakila.tables.CustomerList CUSTOMER_LIST = new org.jooq.examples.mysql.sakila.tables.CustomerList();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord, org.joou.UShort> ID = createField("ID", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord, java.lang.String> ZIP_CODE = createField("zip code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord, java.lang.String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord, java.lang.String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord, java.lang.String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord, java.lang.String> NOTES = createField("notes", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerListRecord, org.joou.UByte> SID = createField("SID", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this);

	/**
	 * No further instances allowed
	 */
	private CustomerList() {
		super("customer_list", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * No further instances allowed
	 */
	private CustomerList(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.CustomerList.CUSTOMER_LIST);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.CustomerList as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.CustomerList(alias);
	}
}
