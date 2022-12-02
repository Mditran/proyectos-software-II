package negocio;

/***********************************************************************
 * Module:  Paragraph.java
 * Author:  Kevin
 * Purpose: Defines the Class Paragraph
 ***********************************************************************/

import java.util.*;

/** @pdOid c573c13c-187c-419c-a063-da1ed5e2ae03 */
public class Paragraph {
   /** @pdOid 916fce03-7cd0-4219-8331-30c33d0b4cbd */
   protected List<String> myLines;
   
   /** @pdRoleInfo migr=no name=TextAlignment assc=association1 mult=0..1 type=Aggregation */
   public TextAlignment textAlignment;

    public Paragraph() {
        this.myLines = new ArrayList<String>();
        this.textAlignment = new Left();
    }
   
   
   
   /** @param position
    * @exception Exception
    * @pdOid e2b097e6-16af-4d36-80ad-2ea67c0886b8 */
   public String getLine(int position) throws Exception {
      // TODO: implement
      if(position >= 0 && position< myLines.size())
          return myLines.get(position);
      //else throwsException exception = new Exception("Out of range");
       return null;
   }
   
   /** @pdOid c429406c-d153-4864-9c6a-823820479ca8 */
   public int getSize() {
      // TODO: implement
      return myLines.size();
   }
   
   /** @param line
    * @pdOid c3abe6b6-821e-4577-bba8-83bc8c0dde41 */
   public void addLine(String line) {
      // TODO: implement
      myLines.add(line);
   }
   
   /** @pdOid 0621d031-ac1b-4ab7-b912-8cff63a2ca86 */
   public List<String> textAlignment() {
       myLines=textAlignment.textAlignment(this);
      // TODO: implement
      return myLines;
   }

}