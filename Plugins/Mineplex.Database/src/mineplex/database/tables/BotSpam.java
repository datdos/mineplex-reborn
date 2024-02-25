/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

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
public class BotSpam extends org.jooq.impl.TableImpl<mineplex.database.tables.records.BotSpamRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 99389053;

	/**
	 * The reference instance of <code>Account.botSpam</code>
	 */
	public static final mineplex.database.tables.BotSpam botSpam = new mineplex.database.tables.BotSpam();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.BotSpamRecord> getRecordType() {
		return mineplex.database.tables.records.BotSpamRecord.class;
	}

	/**
	 * The column <code>Account.botSpam.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BotSpamRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.botSpam.text</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BotSpamRecord, java.lang.String> text = createField("text", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

	/**
	 * The column <code>Account.botSpam.punishments</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BotSpamRecord, java.lang.Integer> punishments = createField("punishments", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.botSpam.enabled</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BotSpamRecord, java.lang.Byte> enabled = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.botSpam.createdBy</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BotSpamRecord, java.lang.String> createdBy = createField("createdBy", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.botSpam.enabledBy</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BotSpamRecord, java.lang.String> enabledBy = createField("enabledBy", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>Account.botSpam.disabledBy</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BotSpamRecord, java.lang.String> disabledBy = createField("disabledBy", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * Create a <code>Account.botSpam</code> table reference
	 */
	public BotSpam() {
		this("botSpam", null);
	}

	/**
	 * Create an aliased <code>Account.botSpam</code> table reference
	 */
	public BotSpam(java.lang.String alias) {
		this(alias, mineplex.database.tables.BotSpam.botSpam);
	}

	private BotSpam(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.BotSpamRecord> aliased) {
		this(alias, aliased, null);
	}

	private BotSpam(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.BotSpamRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.BotSpamRecord, java.lang.Integer> getIdentity() {
		return mineplex.database.Keys.IDENTITY_botSpam;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.BotSpamRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_botSpam_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.BotSpamRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.BotSpamRecord>>asList(mineplex.database.Keys.KEY_botSpam_PRIMARY, mineplex.database.Keys.KEY_botSpam_unique_text);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.BotSpam as(java.lang.String alias) {
		return new mineplex.database.tables.BotSpam(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.BotSpam rename(java.lang.String name) {
		return new mineplex.database.tables.BotSpam(name, null);
	}
}
