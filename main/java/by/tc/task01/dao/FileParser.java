package by.tc.task01.dao;

import by.tc.task01.entity.criteria.Criteria;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileParser {

private File file;

private Criteria criteria;

private Scanner reader;



public FileParser(File file , Criteria criteria){
    this.file = file;
}




public Map<String , String> getApplianceMap(String appType) throws IOException{

    Map<String , String> appMap = new HashMap<String , String >();

    List<String > criterians = getCriteriansList(this.criteria);

    try{

        reader  = new Scanner(file);
        while (reader.hasNextLine()){
            String line = reader.nextLine();
            if(line.startsWith(appType)){

                boolean checkForApp = lookingByCriterians(criterians , line);

                if(checkForApp){

                    String[] lineArr = line.split(" ");

                    String[] applProperiesArr = new String[lineArr.length - 2];

                    System.arraycopy(lineArr , 2 , applProperiesArr, 0 , lineArr.length - 2);

                    int lenght = applProperiesArr.length;

                    for(int i = 0; i < lenght; i++){

                        String property = applProperiesArr[i];

                        int spaceIndex = property.indexOf("=");

                        String key = property.substring(0, spaceIndex );
                        String value = property.substring((spaceIndex+1),property.length() - 1);
                        appMap.put(key,value);
                    }

                }
            }

        }

    }catch (IOException e){
        throw e;
    }

    return appMap;
}



private List<String> getCriteriansList(Criteria criteria){

    Map<Object,Object> map = criteria.getCriteria();
    Set entitySet = map.entrySet();
    List<String> criterians = new ArrayList<String>();
    for(Object o : entitySet){
        criterians.add(o.toString());
    }
    return criterians;
}



private boolean lookingByCriterians(List<String> criteriansList , String resultLine){
    int count = 0;
    for(String buf : criteriansList){
        if(resultLine.contains(buf)){
            count = count + 1;
        }
    }
    return criteriansList.size() == count;
}

private String[] separate









}
