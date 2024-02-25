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
public class ClansRecord extends org.jooq.impl.UpdatableRecordImpl<mineplex.database.tables.records.ClansRecord> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record17<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -1257933448;

	/**
	 * Setter for <code>Account.clans.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Account.clans.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Account.clans.serverId</code>.
	 */
	public void setServerId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Account.clans.serverId</code>.
	 */
	public java.lang.Integer getServerId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>Account.clans.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Account.clans.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>Account.clans.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>Account.clans.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>Account.clans.home</code>.
	 */
	public void setHome(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>Account.clans.home</code>.
	 */
	public java.lang.String getHome() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>Account.clans.admin</code>.
	 */
	public void setAdmin(java.lang.Boolean value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>Account.clans.admin</code>.
	 */
	public java.lang.Boolean getAdmin() {
		return (java.lang.Boolean) getValue(5);
	}

	/**
	 * Setter for <code>Account.clans.dateCreated</code>.
	 */
	public void setDateCreated(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>Account.clans.dateCreated</code>.
	 */
	public java.sql.Timestamp getDateCreated() {
		return (java.sql.Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>Account.clans.lastOnline</code>.
	 */
	public void setLastOnline(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>Account.clans.lastOnline</code>.
	 */
	public java.sql.Timestamp getLastOnline() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>Account.clans.energy</code>.
	 */
	public void setEnergy(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>Account.clans.energy</code>.
	 */
	public java.lang.Integer getEnergy() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>Account.clans.kills</code>.
	 */
	public void setKills(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>Account.clans.kills</code>.
	 */
	public java.lang.Integer getKills() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>Account.clans.murder</code>.
	 */
	public void setMurder(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>Account.clans.murder</code>.
	 */
	public java.lang.Integer getMurder() {
		return (java.lang.Integer) getValue(10);
	}

	/**
	 * Setter for <code>Account.clans.deaths</code>.
	 */
	public void setDeaths(java.lang.Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>Account.clans.deaths</code>.
	 */
	public java.lang.Integer getDeaths() {
		return (java.lang.Integer) getValue(11);
	}

	/**
	 * Setter for <code>Account.clans.warWins</code>.
	 */
	public void setWarWins(java.lang.Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>Account.clans.warWins</code>.
	 */
	public java.lang.Integer getWarWins() {
		return (java.lang.Integer) getValue(12);
	}

	/**
	 * Setter for <code>Account.clans.warLosses</code>.
	 */
	public void setWarLosses(java.lang.Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>Account.clans.warLosses</code>.
	 */
	public java.lang.Integer getWarLosses() {
		return (java.lang.Integer) getValue(13);
	}

	/**
	 * Setter for <code>Account.clans.generator</code>.
	 */
	public void setGenerator(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>Account.clans.generator</code>.
	 */
	public java.lang.String getGenerator() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>Account.clans.generatorStock</code>.
	 */
	public void setGeneratorStock(java.lang.Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>Account.clans.generatorStock</code>.
	 */
	public java.lang.Integer getGeneratorStock() {
		return (java.lang.Integer) getValue(15);
	}

	/**
	 * Setter for <code>Account.clans.eloRating</code>.
	 */
	public void setEloRating(java.lang.Integer value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>Account.clans.eloRating</code>.
	 */
	public java.lang.Integer getEloRating() {
		return (java.lang.Integer) getValue(16);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record17 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row17) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row17) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return mineplex.database.tables.Clans.clans.id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return mineplex.database.tables.Clans.clans.serverId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return mineplex.database.tables.Clans.clans.name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return mineplex.database.tables.Clans.clans.description;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return mineplex.database.tables.Clans.clans.home;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field6() {
		return mineplex.database.tables.Clans.clans.admin;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return mineplex.database.tables.Clans.clans.dateCreated;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return mineplex.database.tables.Clans.clans.lastOnline;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return mineplex.database.tables.Clans.clans.energy;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return mineplex.database.tables.Clans.clans.kills;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return mineplex.database.tables.Clans.clans.murder;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return mineplex.database.tables.Clans.clans.deaths;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field13() {
		return mineplex.database.tables.Clans.clans.warWins;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field14() {
		return mineplex.database.tables.Clans.clans.warLosses;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return mineplex.database.tables.Clans.clans.generator;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field16() {
		return mineplex.database.tables.Clans.clans.generatorStock;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field17() {
		return mineplex.database.tables.Clans.clans.eloRating;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getServerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getHome();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value6() {
		return getAdmin();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getDateCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getLastOnline();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getEnergy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getKills();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getMurder();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getDeaths();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value13() {
		return getWarWins();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value14() {
		return getWarLosses();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getGenerator();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value16() {
		return getGeneratorStock();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value17() {
		return getEloRating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value2(java.lang.Integer value) {
		setServerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value3(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value4(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value5(java.lang.String value) {
		setHome(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value6(java.lang.Boolean value) {
		setAdmin(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value7(java.sql.Timestamp value) {
		setDateCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value8(java.sql.Timestamp value) {
		setLastOnline(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value9(java.lang.Integer value) {
		setEnergy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value10(java.lang.Integer value) {
		setKills(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value11(java.lang.Integer value) {
		setMurder(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value12(java.lang.Integer value) {
		setDeaths(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value13(java.lang.Integer value) {
		setWarWins(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value14(java.lang.Integer value) {
		setWarLosses(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value15(java.lang.String value) {
		setGenerator(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value16(java.lang.Integer value) {
		setGeneratorStock(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord value17(java.lang.Integer value) {
		setEloRating(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.Boolean value6, java.sql.Timestamp value7, java.sql.Timestamp value8, java.lang.Integer value9, java.lang.Integer value10, java.lang.Integer value11, java.lang.Integer value12, java.lang.Integer value13, java.lang.Integer value14, java.lang.String value15, java.lang.Integer value16, java.lang.Integer value17) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ClansRecord
	 */
	public ClansRecord() {
		super(mineplex.database.tables.Clans.clans);
	}

	/**
	 * Create a detached, initialised ClansRecord
	 */
	public ClansRecord(java.lang.Integer id, java.lang.Integer serverId, java.lang.String name, java.lang.String description, java.lang.String home, java.lang.Boolean admin, java.sql.Timestamp dateCreated, java.sql.Timestamp lastOnline, java.lang.Integer energy, java.lang.Integer kills, java.lang.Integer murder, java.lang.Integer deaths, java.lang.Integer warWins, java.lang.Integer warLosses, java.lang.String generator, java.lang.Integer generatorStock, java.lang.Integer eloRating) {
		super(mineplex.database.tables.Clans.clans);

		setValue(0, id);
		setValue(1, serverId);
		setValue(2, name);
		setValue(3, description);
		setValue(4, home);
		setValue(5, admin);
		setValue(6, dateCreated);
		setValue(7, lastOnline);
		setValue(8, energy);
		setValue(9, kills);
		setValue(10, murder);
		setValue(11, deaths);
		setValue(12, warWins);
		setValue(13, warLosses);
		setValue(14, generator);
		setValue(15, generatorStock);
		setValue(16, eloRating);
	}
}
