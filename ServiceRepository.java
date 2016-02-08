package lesson7_10.container;


import java.util.ArrayList;
import java.util.List;

public class ServiceRepository<T extends Service>{

    private List<T> listService;

    public ServiceRepository() {

        listService = new ArrayList<T>();
    }

    public List<T> getListService() {
        return listService;
    }

    public void addService(T service) {

        listService.add(service);
    }

    public void removeService(T service) {

        listService.remove(service);
    }
}
