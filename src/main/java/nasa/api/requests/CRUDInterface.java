package nasa.api.requests;

public interface CRUDInterface {
    public Object create(Object obj);

    public Object get();

    public Object update(String id, Object obj);

    public Object delete(String id);
}
