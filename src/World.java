/**
 * Created with IntelliJ IDEA.
 * User: TriD
 * Date: 25.05.12
 * Time: 2:23
 * To change this template use File | Settings | File Templates.
 */
public class World {
    private static World instance;
    private Map map;

    private World(){

    }

    public World getWorld(){
        if (instance == null)
            instance = new World();
        return instance;
    }
}
