package negocio;

/***********************************************************************
 * Module:  Left.java
 * Author:  Kevin
 * Purpose: Defines the Class Left
 ***********************************************************************/

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/** @pdOid 160c7482-2e2c-4363-9ce5-5a04b95f95cc */
public class Left implements TextAlignment {
   /** @param p
    * @pdOid cd1897f3-ecbc-4cbd-87d7-57d9a315e505 */
   @Override
   public List<String> textAlignment(Paragraph p) {
      // TODO: implement
      List<String> myLines = new ArrayList<>();
       for (int i = 0; i < p.getSize(); i++) {
          try {
              // Elimina espacios delante y detrás
              myLines.add(p.getLine(i).trim());
          } catch (Exception ex) {
              Logger.getLogger(Left.class.getName()).log(Level.SEVERE, null, ex);
          }
       }
      return myLines;
   }

}