package org.taktik.freehealth.middleware.drugs.dto;
// Generated Feb 27, 2008 11:38:04 AM by Hibernate Tools 3.2.0.CR1



/**
 * AtcId generated by hbm2java
 */
public class AtcId  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
     private String mppId;
     private String lang;

    public AtcId() {
    }

    public AtcId(String mppId, String lang) {
       this.mppId = mppId;
       this.lang = lang;
    }
   
    public String getMppId() {
        return this.mppId;
    }
    
    public void setMppId(String mppId) {
        this.mppId = mppId;
    }
    public String getLang() {
        return this.lang;
    }
    
    public void setLang(String lang) {
        this.lang = lang;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AtcId) ) return false;
		 AtcId castOther = ( AtcId ) other; 
         
		 return ( (this.getMppId()==castOther.getMppId()) || ( this.getMppId()!=null && castOther.getMppId()!=null && this.getMppId().equals(castOther.getMppId()) ) )
 && ( (this.getLang()==castOther.getLang()) || ( this.getLang()!=null && castOther.getLang()!=null && this.getLang().equals(castOther.getLang()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMppId() == null ? 0 : this.getMppId().hashCode() );
         result = 37 * result + ( getLang() == null ? 0 : this.getLang().hashCode() );
         return result;
   }   


}

