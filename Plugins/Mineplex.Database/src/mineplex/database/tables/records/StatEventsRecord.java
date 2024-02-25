/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.2"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StatEventsRecord extends org.jooq.impl.UpdatableRecordImpl<mineplex.database.tables.records.StatEventsRecord> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record7<org.jooq.types.UInteger, org.jooq.types.UInteger, java.sql.Date, org.jooq.types.UByte, java.lang.String, org.jooq.types.UByte, org.jooq.types.UShort> {

	private static final long serialVersionUID = -85575801;

	/**
	 * Setter for <code>Account.statEvents.eventId</code>.
	 */
	public void setEventId(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Account.statEvents.eventId</code>.
	 */
	public org.jooq.types.UInteger getEventId() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>Account.statEvents.accountId</code>.
	 */
	public void setAccountId(org.jooq.types.UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Account.statEvents.accountId</code>.
	 */
	public org.jooq.types.UInteger getAccountId() {
		return (org.jooq.types.UInteger) getValue(1);
	}

	/**
	 * Setter for <code>Account.statEvents.date</code>.
	 */
	public void setDate(java.sql.Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Account.statEvents.date</code>.
	 */
	public java.sql.Date getDate() {
		return (java.sql.Date) getValue(2);
	}

	/**
	 * Setter for <code>Account.statEvents.gamemode</code>.
	 */
	public void setGamemode(org.jooq.types.UByte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>Account.statEvents.gamemode</code>.
	 */
	public org.jooq.types.UByte getGamemode() {
		return (org.jooq.types.UByte) getValue(3);
	}

	/**
	 * Setter for <code>Account.statEvents.serverGroup</code>.
	 */
	public void setServerGroup(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>Account.statEvents.serverGroup</code>.
	 */
	public java.lang.String getServerGroup() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>Account.statEvents.type</code>.
	 */
	public void setType(org.jooq.types.UByte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>Account.statEvents.type</code>.
	 */
	public org.jooq.types.UByte getType() {
		return (org.jooq.types.UByte) getValue(5);
	}

	/**
	 * Setter for <code>Account.statEvents.value</code>.
	 */
	public void setValue(org.jooq.types.UShort value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>Account.statEvents.value</code>.
	 */
	public org.jooq.types.UShort getValue() {
		return (org.jooq.types.UShort) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<org.jooq.types.UInteger> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<org.jooq.types.UInteger, org.jooq.types.UInteger, java.sql.Date, org.jooq.types.UByte, java.lang.String, org.jooq.types.UByte, org.jooq.types.UShort> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<org.jooq.types.UInteger, org.jooq.types.UInteger, java.sql.Date, org.jooq.types.UByte, java.lang.String, org.jooq.types.UByte, org.jooq.types.UShort> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return mineplex.database.tables.StatEvents.statEvents.eventId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field2() {
		return mineplex.database.tables.StatEvents.statEvents.accountId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field3() {
		return mineplex.database.tables.StatEvents.statEvents.date;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UByte> field4() {
		return mineplex.database.tables.StatEvents.statEvents.gamemode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return mineplex.database.tables.StatEvents.statEvents.serverGroup;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UByte> field6() {
		return mineplex.database.tables.StatEvents.statEvents.type;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UShort> field7() {
		return mineplex.database.tables.StatEvents.statEvents.value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value1() {
		return getEventId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value2() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value3() {
		return getDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UByte value4() {
		return getGamemode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getServerGroup();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UByte value6() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UShort value7() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatEventsRecord value1(org.jooq.types.UInteger value) {
		setEventId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatEventsRecord value2(org.jooq.types.UInteger value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatEventsRecord value3(java.sql.Date value) {
		setDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatEventsRecord value4(org.jooq.types.UByte value) {
		setGamemode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatEventsRecord value5(java.lang.String value) {
		setServerGroup(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatEventsRecord value6(org.jooq.types.UByte value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatEventsRecord value7(org.jooq.types.UShort value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatEventsRecord values(org.jooq.types.UInteger value1, org.jooq.types.UInteger value2, java.sql.Date value3, org.jooq.types.UByte value4, java.lang.String value5, org.jooq.types.UByte value6, org.jooq.types.UShort value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StatEventsRecord
	 */
	public StatEventsRecord() {
		super(mineplex.database.tables.StatEvents.statEvents);
	}

	/**
	 * Create a detached, initialised StatEventsRecord
	 */
	public StatEventsRecord(org.jooq.types.UInteger eventId, org.jooq.types.UInteger accountId, java.sql.Date date, org.jooq.types.UByte gamemode, java.lang.String serverGroup, org.jooq.types.UByte type, org.jooq.types.UShort value) {
		super(mineplex.database.tables.StatEvents.statEvents);

		setValue(0, eventId);
		setValue(1, accountId);
		setValue(2, date);
		setValue(3, gamemode);
		setValue(4, serverGroup);
		setValue(5, type);
		setValue(6, value);
	}
}
