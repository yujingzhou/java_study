package test.com;

import java.util.HashMap;
import java.util.Map;

public class Favorites {
    
    private Map<Class<?>, Object> favorites = new HashMap<Class<?>, Object>();
    
    public <T> T getFavorite(Class<T> type){
        return type.cast(favorites.get(type));
    }

}
