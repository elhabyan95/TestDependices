
package com.mycompany.testdependices2;

import java.io.IOException;
import java.util.List;
import joinery.DataFrame;
import tech.tablesaw.api.Table;


public class NewMain {

    public static void main(String[] args) throws IOException {
        
        // Reading file using Joinary
        DataFrame<Object> df = DataFrame.readCsv("F:\\titanic.csv");
        List<Object> passengers = df.col("Survived");
        System.out.println("Joinary survived column"+passengers);

        //Reading file using Tablesaw
         Table data;
            data = Table.read().csv("F:\\titanic.csv");
            System.out.println("data");
            System.out.println(data.summary());
    }
    
}
