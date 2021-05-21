package javaprogramming.stringpractice;

import dummy.TableDef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDemo1 {

    public static void main(String[] args) {

        TableDef tab1 = new TableDef("acm", "PAM");
        TableDef tab2 = new TableDef("acm_common", "PAM");
        TableDef tab3 = new TableDef("acct_mgr", "PAM");
        TableDef tab4 = new TableDef("acct_desc", "PAM");
        TableDef tab5 = new TableDef("cupHaircut", "HAIRCUT");
        TableDef tab6 = new TableDef("cupAlternate", "ALTERNATE");
        TableDef tab7 = new TableDef("bogie", "BOGIE");

        List<TableDef> tableDefs = new ArrayList<>();
        tableDefs.add(tab1);
        tableDefs.add(tab2);
        tableDefs.add(tab3);
        tableDefs.add(tab4);
        tableDefs.add(tab5);
        tableDefs.add(tab6);
        tableDefs.add(tab7);

        Map<String, List<TableDef>> tableMapping = new HashMap<>();
        for(TableDef td : tableDefs){
            String tableGroup = td.getTableGroup();
            List<TableDef> tdList = tableMapping.get(tableGroup);
            if(tdList == null){
                tdList = new ArrayList<>();
                tableMapping.put(tableGroup, tdList);
            }
            tdList.add(td);
        }
        /**
         * Second approach with computeIfAbsent
         */
        Map<String, List<TableDef>> tableMapping1 = new HashMap<>();
        for(TableDef td : tableDefs){
            String tableGroup = td.getTableGroup();
            tableMapping1.computeIfAbsent(tableGroup, k -> new ArrayList<>()).add(td);
        }
        /**
         * Third approach using goupingBy
         */

        Map<String, List<TableDef>> tableMapping3 = tableDefs.stream().collect(Collectors.groupingBy(TableDef::getTableGroup));

    }
}
