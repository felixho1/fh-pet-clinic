package ho.felix.fhpetclinic.services.map;

import ho.felix.fhpetclinic.model.BaseEntity;
import ho.felix.fhpetclinic.services.CrudService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {
    protected Map<Long, T> map = new HashMap<>();

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<T>(map.values());
    }

    @Override
    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    @Override
    public T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
            return object;
        }
        else {
            throw new RuntimeException("object added can not be null");
        }
    }

    private Long getNextId() {
        HashSet<Long> keys = new HashSet<>(map.keySet());
        keys.add(0L);
        return Collections.max(keys) + 1;
    }

}
