package CompositePattern.Example;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent{
    private String groupName;
    private String groupDescription;
    private ArrayList<SongComponent> songComponents = new ArrayList<>();

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName(){
        return  groupName;
    }
    public String getGroupDescription(){
        return  groupDescription;
    }

    public void add (SongComponent newSongComponent){
        songComponents.add(newSongComponent);
    }
    public void remove (SongComponent newSongComponent){
        songComponents.remove(newSongComponent);
    }
    public SongComponent getComponent(int componentIndex){
        return  songComponents.get(componentIndex);
    }

    public void displaySongInfo(){
        System.out.println("Group Name :" + getGroupName());
        System.out.println("Group Description:" + getGroupDescription());

        Iterator componentItearator  =songComponents.iterator();

        while(componentItearator.hasNext()){
           SongComponent songInfo =(SongComponent) componentItearator.next();
           songInfo.displaySongInfo();
       }

    }
}
