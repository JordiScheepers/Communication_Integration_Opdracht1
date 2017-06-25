
package nl.hu.fnt.gsos.wsinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="country">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;group ref="{/entities/climat}country"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "country"
})
@XmlRootElement(name = "RequestClimat")
public class RequestClimat {

    @XmlElement(required = true)
    protected RequestClimat.Country country;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link RequestClimat.Country }
     *     
     */
    public RequestClimat.Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestClimat.Country }
     *     
     */
    public void setCountry(RequestClimat.Country value) {
        this.country = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{/entities/climat}country"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nameCountry",
        "codeCountry",
        "month"
    })
    public static class Country {

        @XmlElement(required = true)
        protected String nameCountry;
        @XmlElement(required = true)
        protected String codeCountry;
        @XmlElement(required = true)
        protected RequestClimat.Country.Month month;

        /**
         * Gets the value of the nameCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameCountry() {
            return nameCountry;
        }

        /**
         * Sets the value of the nameCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameCountry(String value) {
            this.nameCountry = value;
        }

        /**
         * Gets the value of the codeCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeCountry() {
            return codeCountry;
        }

        /**
         * Sets the value of the codeCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeCountry(String value) {
            this.codeCountry = value;
        }

        /**
         * Gets the value of the month property.
         * 
         * @return
         *     possible object is
         *     {@link RequestClimat.Country.Month }
         *     
         */
        public RequestClimat.Country.Month getMonth() {
            return month;
        }

        /**
         * Sets the value of the month property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestClimat.Country.Month }
         *     
         */
        public void setMonth(RequestClimat.Country.Month value) {
            this.month = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;group ref="{/entities/climat}month"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nameMonth",
            "numberMonth"
        })
        public static class Month {

            @XmlElement(required = true)
            protected String nameMonth;
            protected int numberMonth;

            /**
             * Gets the value of the nameMonth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNameMonth() {
                return nameMonth;
            }

            /**
             * Sets the value of the nameMonth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNameMonth(String value) {
                this.nameMonth = value;
            }

            /**
             * Gets the value of the numberMonth property.
             * 
             */
            public int getNumberMonth() {
                return numberMonth;
            }

            /**
             * Sets the value of the numberMonth property.
             * 
             */
            public void setNumberMonth(int value) {
                this.numberMonth = value;
            }

        }

    }

}
