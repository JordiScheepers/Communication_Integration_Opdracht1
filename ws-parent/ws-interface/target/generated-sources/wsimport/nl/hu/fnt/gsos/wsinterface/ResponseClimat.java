
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
 *         &lt;element name="climat">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="country">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;group ref="{/entities/climat}country"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="month">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;group ref="{/entities/climat}month"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{/entities/climat}maxTemp"/>
 *                   &lt;element ref="{/entities/climat}minTemp"/>
 *                   &lt;element ref="{/entities/climat}meanSunDays"/>
 *                   &lt;element ref="{/entities/climat}meanRainDays"/>
 *                   &lt;choice>
 *                     &lt;element ref="{/entities/climat}seaTemp"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "climat"
})
@XmlRootElement(name = "ResponseClimat")
public class ResponseClimat {

    @XmlElement(required = true)
    protected ResponseClimat.Climat climat;

    /**
     * Gets the value of the climat property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseClimat.Climat }
     *     
     */
    public ResponseClimat.Climat getClimat() {
        return climat;
    }

    /**
     * Sets the value of the climat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseClimat.Climat }
     *     
     */
    public void setClimat(ResponseClimat.Climat value) {
        this.climat = value;
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
     *       &lt;sequence>
     *         &lt;element name="country">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;group ref="{/entities/climat}country"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="month">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;group ref="{/entities/climat}month"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{/entities/climat}maxTemp"/>
     *         &lt;element ref="{/entities/climat}minTemp"/>
     *         &lt;element ref="{/entities/climat}meanSunDays"/>
     *         &lt;element ref="{/entities/climat}meanRainDays"/>
     *         &lt;choice>
     *           &lt;element ref="{/entities/climat}seaTemp"/>
     *         &lt;/choice>
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
        "country",
        "month",
        "maxTemp",
        "minTemp",
        "meanSunDays",
        "meanRainDays",
        "seaTemp"
    })
    public static class Climat {

        @XmlElement(required = true)
        protected ResponseClimat.Climat.Country country;
        @XmlElement(required = true)
        protected ResponseClimat.Climat.Month month;
        protected int maxTemp;
        protected int minTemp;
        protected int meanSunDays;
        protected int meanRainDays;
        protected Integer seaTemp;

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseClimat.Climat.Country }
         *     
         */
        public ResponseClimat.Climat.Country getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseClimat.Climat.Country }
         *     
         */
        public void setCountry(ResponseClimat.Climat.Country value) {
            this.country = value;
        }

        /**
         * Gets the value of the month property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseClimat.Climat.Month }
         *     
         */
        public ResponseClimat.Climat.Month getMonth() {
            return month;
        }

        /**
         * Sets the value of the month property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseClimat.Climat.Month }
         *     
         */
        public void setMonth(ResponseClimat.Climat.Month value) {
            this.month = value;
        }

        /**
         * Gets the value of the maxTemp property.
         * 
         */
        public int getMaxTemp() {
            return maxTemp;
        }

        /**
         * Sets the value of the maxTemp property.
         * 
         */
        public void setMaxTemp(int value) {
            this.maxTemp = value;
        }

        /**
         * Gets the value of the minTemp property.
         * 
         */
        public int getMinTemp() {
            return minTemp;
        }

        /**
         * Sets the value of the minTemp property.
         * 
         */
        public void setMinTemp(int value) {
            this.minTemp = value;
        }

        /**
         * Gets the value of the meanSunDays property.
         * 
         */
        public int getMeanSunDays() {
            return meanSunDays;
        }

        /**
         * Sets the value of the meanSunDays property.
         * 
         */
        public void setMeanSunDays(int value) {
            this.meanSunDays = value;
        }

        /**
         * Gets the value of the meanRainDays property.
         * 
         */
        public int getMeanRainDays() {
            return meanRainDays;
        }

        /**
         * Sets the value of the meanRainDays property.
         * 
         */
        public void setMeanRainDays(int value) {
            this.meanRainDays = value;
        }

        /**
         * Gets the value of the seaTemp property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSeaTemp() {
            return seaTemp;
        }

        /**
         * Sets the value of the seaTemp property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSeaTemp(Integer value) {
            this.seaTemp = value;
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
            protected nl.hu.fnt.gsos.wsinterface.RequestClimat.Country.Month month;

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
             *     {@link nl.hu.fnt.gsos.wsinterface.RequestClimat.Country.Month }
             *     
             */
            public nl.hu.fnt.gsos.wsinterface.RequestClimat.Country.Month getMonth() {
                return month;
            }

            /**
             * Sets the value of the month property.
             * 
             * @param value
             *     allowed object is
             *     {@link nl.hu.fnt.gsos.wsinterface.RequestClimat.Country.Month }
             *     
             */
            public void setMonth(nl.hu.fnt.gsos.wsinterface.RequestClimat.Country.Month value) {
                this.month = value;
            }

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
