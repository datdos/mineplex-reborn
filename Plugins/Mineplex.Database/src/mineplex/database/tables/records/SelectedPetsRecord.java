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
public class SelectedPetsRecord extends org.jooq.impl.TableRecordImpl<mineplex.database.tables.records.SelectedPetsRecord> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record2<java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 1295478529;

	/**
	 * Setter for <code>Account.selectedPets.accountId</code>.
	 */
	public void setAccountId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Account.selectedPets.accountId</code>.
	 */
	public java.lang.Integer getAccountId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Account.selectedPets.selected</code>.
	 */
	public void setSelected(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Account.selectedPets.selected</code>.
	 */
	public java.lang.String getSelected() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return mineplex.database.tables.SelectedPets.selectedPets.accountId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return mineplex.database.tables.SelectedPets.selectedPets.selected;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getSelected();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SelectedPetsRecord value1(java.lang.Integer value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SelectedPetsRecord value2(java.lang.String value) {
		setSelected(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SelectedPetsRecord values(java.lang.Integer value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SelectedPetsRecord
	 */
	public SelectedPetsRecord() {
		super(mineplex.database.tables.SelectedPets.selectedPets);
	}

	/**
	 * Create a detached, initialised SelectedPetsRecord
	 */
	public SelectedPetsRecord(java.lang.Integer accountId, java.lang.String selected) {
		super(mineplex.database.tables.SelectedPets.selectedPets);

		setValue(0, accountId);
		setValue(1, selected);
	}
}