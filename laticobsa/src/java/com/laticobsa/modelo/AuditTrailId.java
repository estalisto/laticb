package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1



/**
 * AuditTrailId generated by hbm2java
 */
public class AuditTrailId  implements java.io.Serializable {


     private String oldEmail;
     private String newEmail;

    public AuditTrailId() {
    }

    public AuditTrailId(String oldEmail, String newEmail) {
       this.oldEmail = oldEmail;
       this.newEmail = newEmail;
    }
   
    public String getOldEmail() {
        return this.oldEmail;
    }
    
    public void setOldEmail(String oldEmail) {
        this.oldEmail = oldEmail;
    }
    public String getNewEmail() {
        return this.newEmail;
    }
    
    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AuditTrailId) ) return false;
		 AuditTrailId castOther = ( AuditTrailId ) other; 
         
		 return ( (this.getOldEmail()==castOther.getOldEmail()) || ( this.getOldEmail()!=null && castOther.getOldEmail()!=null && this.getOldEmail().equals(castOther.getOldEmail()) ) )
 && ( (this.getNewEmail()==castOther.getNewEmail()) || ( this.getNewEmail()!=null && castOther.getNewEmail()!=null && this.getNewEmail().equals(castOther.getNewEmail()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getOldEmail() == null ? 0 : this.getOldEmail().hashCode() );
         result = 37 * result + ( getNewEmail() == null ? 0 : this.getNewEmail().hashCode() );
         return result;
   }   


}


