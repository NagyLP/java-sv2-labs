package SQL.week17.services;

@SuppressWarnings("java:S6206")
public class SqlValues {

    private final int index;
    private final Object value;

    public static SqlValues of(int index, Object value) {
        return new SqlValues(index, value);
    }

    private SqlValues(int index, Object value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public Object getValue() {
        return value;
    }
}
