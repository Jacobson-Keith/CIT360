package MVC;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class MapModel implements Serializable{
    
    private States[] location;

    public MapModel() {
    }
    
    public States[] getLocation() {
        return location;
    }

    public void setLocation(States[] location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Map{" + "location=" + location + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Arrays.deepHashCode(this.location);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MapModel other = (MapModel) obj;
        if (!Arrays.deepEquals(this.location, other.location)) {
            return false;
        }
        return true;
    }

}
