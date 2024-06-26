//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.04.07 a las 03:21:09 AM COT 
//


package org.coderic.model.common.xmldsig;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.coderic.model.common.xmldsig package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Any_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "Any");
    private final static QName _ObjectIdentifier_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "ObjectIdentifier");
    private final static QName _EncapsulatedPKIData_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "EncapsulatedPKIData");
    private final static QName _Include_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "Include");
    private final static QName _ReferenceInfo_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "ReferenceInfo");
    private final static QName _XAdESTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "XAdESTimeStamp");
    private final static QName _OtherTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "OtherTimeStamp");
    private final static QName _QualifyingProperties_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "QualifyingProperties");
    private final static QName _SignedProperties_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignedProperties");
    private final static QName _UnsignedProperties_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "UnsignedProperties");
    private final static QName _SignedSignatureProperties_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignedSignatureProperties");
    private final static QName _SignedDataObjectProperties_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignedDataObjectProperties");
    private final static QName _UnsignedSignatureProperties_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "UnsignedSignatureProperties");
    private final static QName _UnsignedDataObjectProperties_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "UnsignedDataObjectProperties");
    private final static QName _QualifyingPropertiesReference_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "QualifyingPropertiesReference");
    private final static QName _SigningTime_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SigningTime");
    private final static QName _SigningCertificate_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SigningCertificate");
    private final static QName _SignaturePolicyIdentifier_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignaturePolicyIdentifier");
    private final static QName _SPURI_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SPURI");
    private final static QName _SPUserNotice_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SPUserNotice");
    private final static QName _CounterSignature_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "CounterSignature");
    private final static QName _DataObjectFormat_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "DataObjectFormat");
    private final static QName _CommitmentTypeIndication_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "CommitmentTypeIndication");
    private final static QName _SignatureProductionPlace_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignatureProductionPlace");
    private final static QName _SignerRole_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignerRole");
    private final static QName _AllDataObjectsTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AllDataObjectsTimeStamp");
    private final static QName _IndividualDataObjectsTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "IndividualDataObjectsTimeStamp");
    private final static QName _SignatureTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignatureTimeStamp");
    private final static QName _CompleteCertificateRefs_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "CompleteCertificateRefs");
    private final static QName _CompleteRevocationRefs_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "CompleteRevocationRefs");
    private final static QName _AttributeCertificateRefs_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttributeCertificateRefs");
    private final static QName _AttributeRevocationRefs_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttributeRevocationRefs");
    private final static QName _SigAndRefsTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SigAndRefsTimeStamp");
    private final static QName _RefsOnlyTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "RefsOnlyTimeStamp");
    private final static QName _CertificateValues_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "CertificateValues");
    private final static QName _RevocationValues_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "RevocationValues");
    private final static QName _AttrAuthoritiesCertValues_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttrAuthoritiesCertValues");
    private final static QName _AttributeRevocationValues_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttributeRevocationValues");
    private final static QName _ArchiveTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "ArchiveTimeStamp");
    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private final static QName _SignatureValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureValue");
    private final static QName _SignedInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
    private final static QName _CanonicalizationMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
    private final static QName _SignatureMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
    private final static QName _Reference_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
    private final static QName _Transforms_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
    private final static QName _Transform_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    private final static QName _DigestMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
    private final static QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    private final static QName _KeyInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
    private final static QName _KeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
    private final static QName _MgmtData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
    private final static QName _KeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
    private final static QName _RetrievalMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RetrievalMethod");
    private final static QName _X509Data_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
    private final static QName _PGPData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPData");
    private final static QName _SPKIData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKIData");
    private final static QName _Object_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Object");
    private final static QName _Manifest_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Manifest");
    private final static QName _SignatureProperties_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperties");
    private final static QName _SignatureProperty_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperty");
    private final static QName _DSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue");
    private final static QName _RSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
    private final static QName _TimeStampValidationData_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "TimeStampValidationData");
    private final static QName _ArchiveTimeStampV2_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "ArchiveTimeStampV2");
    private final static QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");
    private final static QName _PGPDataTypePGPKeyID_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyID");
    private final static QName _PGPDataTypePGPKeyPacket_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyPacket");
    private final static QName _X509DataTypeX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private final static QName _X509DataTypeX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private final static QName _X509DataTypeX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private final static QName _X509DataTypeX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private final static QName _X509DataTypeX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private final static QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private final static QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.coderic.model.common.xmldsig
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnyType }
     * 
     */
    public AnyType createAnyType() {
        return new AnyType();
    }

    /**
     * Create an instance of {@link ObjectIdentifierType }
     * 
     */
    public ObjectIdentifierType createObjectIdentifierType() {
        return new ObjectIdentifierType();
    }

    /**
     * Create an instance of {@link EncapsulatedPKIDataType }
     * 
     */
    public EncapsulatedPKIDataType createEncapsulatedPKIDataType() {
        return new EncapsulatedPKIDataType();
    }

    /**
     * Create an instance of {@link IncludeType }
     * 
     */
    public IncludeType createIncludeType() {
        return new IncludeType();
    }

    /**
     * Create an instance of {@link ReferenceInfoType }
     * 
     */
    public ReferenceInfoType createReferenceInfoType() {
        return new ReferenceInfoType();
    }

    /**
     * Create an instance of {@link XAdESTimeStampType }
     * 
     */
    public XAdESTimeStampType createXAdESTimeStampType() {
        return new XAdESTimeStampType();
    }

    /**
     * Create an instance of {@link OtherTimeStampType }
     * 
     */
    public OtherTimeStampType createOtherTimeStampType() {
        return new OtherTimeStampType();
    }

    /**
     * Create an instance of {@link QualifyingPropertiesType }
     * 
     */
    public QualifyingPropertiesType createQualifyingPropertiesType() {
        return new QualifyingPropertiesType();
    }

    /**
     * Create an instance of {@link SignedPropertiesType }
     * 
     */
    public SignedPropertiesType createSignedPropertiesType() {
        return new SignedPropertiesType();
    }

    /**
     * Create an instance of {@link UnsignedPropertiesType }
     * 
     */
    public UnsignedPropertiesType createUnsignedPropertiesType() {
        return new UnsignedPropertiesType();
    }

    /**
     * Create an instance of {@link SignedSignaturePropertiesType }
     * 
     */
    public SignedSignaturePropertiesType createSignedSignaturePropertiesType() {
        return new SignedSignaturePropertiesType();
    }

    /**
     * Create an instance of {@link SignedDataObjectPropertiesType }
     * 
     */
    public SignedDataObjectPropertiesType createSignedDataObjectPropertiesType() {
        return new SignedDataObjectPropertiesType();
    }

    /**
     * Create an instance of {@link UnsignedSignaturePropertiesType }
     * 
     */
    public UnsignedSignaturePropertiesType createUnsignedSignaturePropertiesType() {
        return new UnsignedSignaturePropertiesType();
    }

    /**
     * Create an instance of {@link UnsignedDataObjectPropertiesType }
     * 
     */
    public UnsignedDataObjectPropertiesType createUnsignedDataObjectPropertiesType() {
        return new UnsignedDataObjectPropertiesType();
    }

    /**
     * Create an instance of {@link QualifyingPropertiesReferenceType }
     * 
     */
    public QualifyingPropertiesReferenceType createQualifyingPropertiesReferenceType() {
        return new QualifyingPropertiesReferenceType();
    }

    /**
     * Create an instance of {@link CertIDListType }
     * 
     */
    public CertIDListType createCertIDListType() {
        return new CertIDListType();
    }

    /**
     * Create an instance of {@link SignaturePolicyIdentifierType }
     * 
     */
    public SignaturePolicyIdentifierType createSignaturePolicyIdentifierType() {
        return new SignaturePolicyIdentifierType();
    }

    /**
     * Create an instance of {@link SPUserNoticeType }
     * 
     */
    public SPUserNoticeType createSPUserNoticeType() {
        return new SPUserNoticeType();
    }

    /**
     * Create an instance of {@link CounterSignatureType }
     * 
     */
    public CounterSignatureType createCounterSignatureType() {
        return new CounterSignatureType();
    }

    /**
     * Create an instance of {@link DataObjectFormatType }
     * 
     */
    public DataObjectFormatType createDataObjectFormatType() {
        return new DataObjectFormatType();
    }

    /**
     * Create an instance of {@link CommitmentTypeIndicationType }
     * 
     */
    public CommitmentTypeIndicationType createCommitmentTypeIndicationType() {
        return new CommitmentTypeIndicationType();
    }

    /**
     * Create an instance of {@link SignatureProductionPlaceType }
     * 
     */
    public SignatureProductionPlaceType createSignatureProductionPlaceType() {
        return new SignatureProductionPlaceType();
    }

    /**
     * Create an instance of {@link SignerRoleType }
     * 
     */
    public SignerRoleType createSignerRoleType() {
        return new SignerRoleType();
    }

    /**
     * Create an instance of {@link CompleteCertificateRefsType }
     * 
     */
    public CompleteCertificateRefsType createCompleteCertificateRefsType() {
        return new CompleteCertificateRefsType();
    }

    /**
     * Create an instance of {@link CompleteRevocationRefsType }
     * 
     */
    public CompleteRevocationRefsType createCompleteRevocationRefsType() {
        return new CompleteRevocationRefsType();
    }

    /**
     * Create an instance of {@link CertificateValuesType }
     * 
     */
    public CertificateValuesType createCertificateValuesType() {
        return new CertificateValuesType();
    }

    /**
     * Create an instance of {@link RevocationValuesType }
     * 
     */
    public RevocationValuesType createRevocationValuesType() {
        return new RevocationValuesType();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link DocumentationReferencesType }
     * 
     */
    public DocumentationReferencesType createDocumentationReferencesType() {
        return new DocumentationReferencesType();
    }

    /**
     * Create an instance of {@link CertIDType }
     * 
     */
    public CertIDType createCertIDType() {
        return new CertIDType();
    }

    /**
     * Create an instance of {@link DigestAlgAndValueType }
     * 
     */
    public DigestAlgAndValueType createDigestAlgAndValueType() {
        return new DigestAlgAndValueType();
    }

    /**
     * Create an instance of {@link SignaturePolicyIdType }
     * 
     */
    public SignaturePolicyIdType createSignaturePolicyIdType() {
        return new SignaturePolicyIdType();
    }

    /**
     * Create an instance of {@link SigPolicyQualifiersListType }
     * 
     */
    public SigPolicyQualifiersListType createSigPolicyQualifiersListType() {
        return new SigPolicyQualifiersListType();
    }

    /**
     * Create an instance of {@link NoticeReferenceType }
     * 
     */
    public NoticeReferenceType createNoticeReferenceType() {
        return new NoticeReferenceType();
    }

    /**
     * Create an instance of {@link IntegerListType }
     * 
     */
    public IntegerListType createIntegerListType() {
        return new IntegerListType();
    }

    /**
     * Create an instance of {@link CommitmentTypeQualifiersListType }
     * 
     */
    public CommitmentTypeQualifiersListType createCommitmentTypeQualifiersListType() {
        return new CommitmentTypeQualifiersListType();
    }

    /**
     * Create an instance of {@link ClaimedRolesListType }
     * 
     */
    public ClaimedRolesListType createClaimedRolesListType() {
        return new ClaimedRolesListType();
    }

    /**
     * Create an instance of {@link CertifiedRolesListType }
     * 
     */
    public CertifiedRolesListType createCertifiedRolesListType() {
        return new CertifiedRolesListType();
    }

    /**
     * Create an instance of {@link CRLRefsType }
     * 
     */
    public CRLRefsType createCRLRefsType() {
        return new CRLRefsType();
    }

    /**
     * Create an instance of {@link CRLRefType }
     * 
     */
    public CRLRefType createCRLRefType() {
        return new CRLRefType();
    }

    /**
     * Create an instance of {@link CRLIdentifierType }
     * 
     */
    public CRLIdentifierType createCRLIdentifierType() {
        return new CRLIdentifierType();
    }

    /**
     * Create an instance of {@link OCSPRefsType }
     * 
     */
    public OCSPRefsType createOCSPRefsType() {
        return new OCSPRefsType();
    }

    /**
     * Create an instance of {@link OCSPRefType }
     * 
     */
    public OCSPRefType createOCSPRefType() {
        return new OCSPRefType();
    }

    /**
     * Create an instance of {@link ResponderIDType }
     * 
     */
    public ResponderIDType createResponderIDType() {
        return new ResponderIDType();
    }

    /**
     * Create an instance of {@link OCSPIdentifierType }
     * 
     */
    public OCSPIdentifierType createOCSPIdentifierType() {
        return new OCSPIdentifierType();
    }

    /**
     * Create an instance of {@link OtherCertStatusRefsType }
     * 
     */
    public OtherCertStatusRefsType createOtherCertStatusRefsType() {
        return new OtherCertStatusRefsType();
    }

    /**
     * Create an instance of {@link CRLValuesType }
     * 
     */
    public CRLValuesType createCRLValuesType() {
        return new CRLValuesType();
    }

    /**
     * Create an instance of {@link OCSPValuesType }
     * 
     */
    public OCSPValuesType createOCSPValuesType() {
        return new OCSPValuesType();
    }

    /**
     * Create an instance of {@link OtherCertStatusValuesType }
     * 
     */
    public OtherCertStatusValuesType createOtherCertStatusValuesType() {
        return new OtherCertStatusValuesType();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     * 
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link CanonicalizationMethodType }
     * 
     */
    public CanonicalizationMethodType createCanonicalizationMethodType() {
        return new CanonicalizationMethodType();
    }

    /**
     * Create an instance of {@link SignatureMethodType }
     * 
     */
    public SignatureMethodType createSignatureMethodType() {
        return new SignatureMethodType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link DigestMethodType }
     * 
     */
    public DigestMethodType createDigestMethodType() {
        return new DigestMethodType();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link KeyValueType }
     * 
     */
    public KeyValueType createKeyValueType() {
        return new KeyValueType();
    }

    /**
     * Create an instance of {@link RetrievalMethodType }
     * 
     */
    public RetrievalMethodType createRetrievalMethodType() {
        return new RetrievalMethodType();
    }

    /**
     * Create an instance of {@link X509DataType }
     * 
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link PGPDataType }
     * 
     */
    public PGPDataType createPGPDataType() {
        return new PGPDataType();
    }

    /**
     * Create an instance of {@link SPKIDataType }
     * 
     */
    public SPKIDataType createSPKIDataType() {
        return new SPKIDataType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link ManifestType }
     * 
     */
    public ManifestType createManifestType() {
        return new ManifestType();
    }

    /**
     * Create an instance of {@link SignaturePropertiesType }
     * 
     */
    public SignaturePropertiesType createSignaturePropertiesType() {
        return new SignaturePropertiesType();
    }

    /**
     * Create an instance of {@link SignaturePropertyType }
     * 
     */
    public SignaturePropertyType createSignaturePropertyType() {
        return new SignaturePropertyType();
    }

    /**
     * Create an instance of {@link DSAKeyValueType }
     * 
     */
    public DSAKeyValueType createDSAKeyValueType() {
        return new DSAKeyValueType();
    }

    /**
     * Create an instance of {@link RSAKeyValueType }
     * 
     */
    public RSAKeyValueType createRSAKeyValueType() {
        return new RSAKeyValueType();
    }

    /**
     * Create an instance of {@link X509IssuerSerialType }
     * 
     */
    public X509IssuerSerialType createX509IssuerSerialType() {
        return new X509IssuerSerialType();
    }

    /**
     * Create an instance of {@link ValidationDataType }
     * 
     */
    public ValidationDataType createValidationDataType() {
        return new ValidationDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "Any")
    public JAXBElement<AnyType> createAny(AnyType value) {
        return new JAXBElement<AnyType>(_Any_QNAME, AnyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectIdentifierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectIdentifierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "ObjectIdentifier")
    public JAXBElement<ObjectIdentifierType> createObjectIdentifier(ObjectIdentifierType value) {
        return new JAXBElement<ObjectIdentifierType>(_ObjectIdentifier_QNAME, ObjectIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncapsulatedPKIDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EncapsulatedPKIDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "EncapsulatedPKIData")
    public JAXBElement<EncapsulatedPKIDataType> createEncapsulatedPKIData(EncapsulatedPKIDataType value) {
        return new JAXBElement<EncapsulatedPKIDataType>(_EncapsulatedPKIData_QNAME, EncapsulatedPKIDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncludeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncludeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "Include")
    public JAXBElement<IncludeType> createInclude(IncludeType value) {
        return new JAXBElement<IncludeType>(_Include_QNAME, IncludeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReferenceInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "ReferenceInfo")
    public JAXBElement<ReferenceInfoType> createReferenceInfo(ReferenceInfoType value) {
        return new JAXBElement<ReferenceInfoType>(_ReferenceInfo_QNAME, ReferenceInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "XAdESTimeStamp")
    public JAXBElement<XAdESTimeStampType> createXAdESTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_XAdESTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OtherTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "OtherTimeStamp")
    public JAXBElement<OtherTimeStampType> createOtherTimeStamp(OtherTimeStampType value) {
        return new JAXBElement<OtherTimeStampType>(_OtherTimeStamp_QNAME, OtherTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifyingPropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QualifyingPropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "QualifyingProperties")
    public JAXBElement<QualifyingPropertiesType> createQualifyingProperties(QualifyingPropertiesType value) {
        return new JAXBElement<QualifyingPropertiesType>(_QualifyingProperties_QNAME, QualifyingPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedPropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignedPropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SignedProperties")
    public JAXBElement<SignedPropertiesType> createSignedProperties(SignedPropertiesType value) {
        return new JAXBElement<SignedPropertiesType>(_SignedProperties_QNAME, SignedPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedPropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnsignedPropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "UnsignedProperties")
    public JAXBElement<UnsignedPropertiesType> createUnsignedProperties(UnsignedPropertiesType value) {
        return new JAXBElement<UnsignedPropertiesType>(_UnsignedProperties_QNAME, UnsignedPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedSignaturePropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignedSignaturePropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SignedSignatureProperties")
    public JAXBElement<SignedSignaturePropertiesType> createSignedSignatureProperties(SignedSignaturePropertiesType value) {
        return new JAXBElement<SignedSignaturePropertiesType>(_SignedSignatureProperties_QNAME, SignedSignaturePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedDataObjectPropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignedDataObjectPropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SignedDataObjectProperties")
    public JAXBElement<SignedDataObjectPropertiesType> createSignedDataObjectProperties(SignedDataObjectPropertiesType value) {
        return new JAXBElement<SignedDataObjectPropertiesType>(_SignedDataObjectProperties_QNAME, SignedDataObjectPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedSignaturePropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnsignedSignaturePropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "UnsignedSignatureProperties")
    public JAXBElement<UnsignedSignaturePropertiesType> createUnsignedSignatureProperties(UnsignedSignaturePropertiesType value) {
        return new JAXBElement<UnsignedSignaturePropertiesType>(_UnsignedSignatureProperties_QNAME, UnsignedSignaturePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedDataObjectPropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnsignedDataObjectPropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "UnsignedDataObjectProperties")
    public JAXBElement<UnsignedDataObjectPropertiesType> createUnsignedDataObjectProperties(UnsignedDataObjectPropertiesType value) {
        return new JAXBElement<UnsignedDataObjectPropertiesType>(_UnsignedDataObjectProperties_QNAME, UnsignedDataObjectPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifyingPropertiesReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QualifyingPropertiesReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "QualifyingPropertiesReference")
    public JAXBElement<QualifyingPropertiesReferenceType> createQualifyingPropertiesReference(QualifyingPropertiesReferenceType value) {
        return new JAXBElement<QualifyingPropertiesReferenceType>(_QualifyingPropertiesReference_QNAME, QualifyingPropertiesReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SigningTime")
    public JAXBElement<XMLGregorianCalendar> createSigningTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SigningTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertIDListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CertIDListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SigningCertificate")
    public JAXBElement<CertIDListType> createSigningCertificate(CertIDListType value) {
        return new JAXBElement<CertIDListType>(_SigningCertificate_QNAME, CertIDListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePolicyIdentifierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignaturePolicyIdentifierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SignaturePolicyIdentifier")
    public JAXBElement<SignaturePolicyIdentifierType> createSignaturePolicyIdentifier(SignaturePolicyIdentifierType value) {
        return new JAXBElement<SignaturePolicyIdentifierType>(_SignaturePolicyIdentifier_QNAME, SignaturePolicyIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SPURI")
    public JAXBElement<String> createSPURI(String value) {
        return new JAXBElement<String>(_SPURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPUserNoticeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SPUserNoticeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SPUserNotice")
    public JAXBElement<SPUserNoticeType> createSPUserNotice(SPUserNoticeType value) {
        return new JAXBElement<SPUserNoticeType>(_SPUserNotice_QNAME, SPUserNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CounterSignatureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CounterSignatureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CounterSignature")
    public JAXBElement<CounterSignatureType> createCounterSignature(CounterSignatureType value) {
        return new JAXBElement<CounterSignatureType>(_CounterSignature_QNAME, CounterSignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataObjectFormatType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataObjectFormatType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "DataObjectFormat")
    public JAXBElement<DataObjectFormatType> createDataObjectFormat(DataObjectFormatType value) {
        return new JAXBElement<DataObjectFormatType>(_DataObjectFormat_QNAME, DataObjectFormatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitmentTypeIndicationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommitmentTypeIndicationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CommitmentTypeIndication")
    public JAXBElement<CommitmentTypeIndicationType> createCommitmentTypeIndication(CommitmentTypeIndicationType value) {
        return new JAXBElement<CommitmentTypeIndicationType>(_CommitmentTypeIndication_QNAME, CommitmentTypeIndicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureProductionPlaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureProductionPlaceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SignatureProductionPlace")
    public JAXBElement<SignatureProductionPlaceType> createSignatureProductionPlace(SignatureProductionPlaceType value) {
        return new JAXBElement<SignatureProductionPlaceType>(_SignatureProductionPlace_QNAME, SignatureProductionPlaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignerRoleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignerRoleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SignerRole")
    public JAXBElement<SignerRoleType> createSignerRole(SignerRoleType value) {
        return new JAXBElement<SignerRoleType>(_SignerRole_QNAME, SignerRoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AllDataObjectsTimeStamp")
    public JAXBElement<XAdESTimeStampType> createAllDataObjectsTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_AllDataObjectsTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "IndividualDataObjectsTimeStamp")
    public JAXBElement<XAdESTimeStampType> createIndividualDataObjectsTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_IndividualDataObjectsTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SignatureTimeStamp")
    public JAXBElement<XAdESTimeStampType> createSignatureTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_SignatureTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CompleteCertificateRefs")
    public JAXBElement<CompleteCertificateRefsType> createCompleteCertificateRefs(CompleteCertificateRefsType value) {
        return new JAXBElement<CompleteCertificateRefsType>(_CompleteCertificateRefs_QNAME, CompleteCertificateRefsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CompleteRevocationRefs")
    public JAXBElement<CompleteRevocationRefsType> createCompleteRevocationRefs(CompleteRevocationRefsType value) {
        return new JAXBElement<CompleteRevocationRefsType>(_CompleteRevocationRefs_QNAME, CompleteRevocationRefsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeCertificateRefs")
    public JAXBElement<CompleteCertificateRefsType> createAttributeCertificateRefs(CompleteCertificateRefsType value) {
        return new JAXBElement<CompleteCertificateRefsType>(_AttributeCertificateRefs_QNAME, CompleteCertificateRefsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeRevocationRefs")
    public JAXBElement<CompleteRevocationRefsType> createAttributeRevocationRefs(CompleteRevocationRefsType value) {
        return new JAXBElement<CompleteRevocationRefsType>(_AttributeRevocationRefs_QNAME, CompleteRevocationRefsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SigAndRefsTimeStamp")
    public JAXBElement<XAdESTimeStampType> createSigAndRefsTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_SigAndRefsTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "RefsOnlyTimeStamp")
    public JAXBElement<XAdESTimeStampType> createRefsOnlyTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_RefsOnlyTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CertificateValues")
    public JAXBElement<CertificateValuesType> createCertificateValues(CertificateValuesType value) {
        return new JAXBElement<CertificateValuesType>(_CertificateValues_QNAME, CertificateValuesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "RevocationValues")
    public JAXBElement<RevocationValuesType> createRevocationValues(RevocationValuesType value) {
        return new JAXBElement<RevocationValuesType>(_RevocationValues_QNAME, RevocationValuesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttrAuthoritiesCertValues")
    public JAXBElement<CertificateValuesType> createAttrAuthoritiesCertValues(CertificateValuesType value) {
        return new JAXBElement<CertificateValuesType>(_AttrAuthoritiesCertValues_QNAME, CertificateValuesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeRevocationValues")
    public JAXBElement<RevocationValuesType> createAttributeRevocationValues(RevocationValuesType value) {
        return new JAXBElement<RevocationValuesType>(_AttributeRevocationValues_QNAME, RevocationValuesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "ArchiveTimeStamp")
    public JAXBElement<XAdESTimeStampType> createArchiveTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_ArchiveTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureValue")
    public JAXBElement<SignatureValueType> createSignatureValue(SignatureValueType value) {
        return new JAXBElement<SignatureValueType>(_SignatureValue_QNAME, SignatureValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignedInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignedInfo")
    public JAXBElement<SignedInfoType> createSignedInfo(SignedInfoType value) {
        return new JAXBElement<SignedInfoType>(_SignedInfo_QNAME, SignedInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanonicalizationMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanonicalizationMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "CanonicalizationMethod")
    public JAXBElement<CanonicalizationMethodType> createCanonicalizationMethod(CanonicalizationMethodType value) {
        return new JAXBElement<CanonicalizationMethodType>(_CanonicalizationMethod_QNAME, CanonicalizationMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureMethod")
    public JAXBElement<SignatureMethodType> createSignatureMethod(SignatureMethodType value) {
        return new JAXBElement<SignatureMethodType>(_SignatureMethod_QNAME, SignatureMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Reference")
    public JAXBElement<ReferenceType> createReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_Reference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transforms")
    public JAXBElement<TransformsType> createTransforms(TransformsType value) {
        return new JAXBElement<TransformsType>(_Transforms_QNAME, TransformsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transform")
    public JAXBElement<TransformType> createTransform(TransformType value) {
        return new JAXBElement<TransformType>(_Transform_QNAME, TransformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigestMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DigestMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestMethod")
    public JAXBElement<DigestMethodType> createDigestMethod(DigestMethodType value) {
        return new JAXBElement<DigestMethodType>(_DigestMethod_QNAME, DigestMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<byte[]>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyInfo")
    public JAXBElement<KeyInfoType> createKeyInfo(KeyInfoType value) {
        return new JAXBElement<KeyInfoType>(_KeyInfo_QNAME, KeyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyName")
    public JAXBElement<String> createKeyName(String value) {
        return new JAXBElement<String>(_KeyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "MgmtData")
    public JAXBElement<String> createMgmtData(String value) {
        return new JAXBElement<String>(_MgmtData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyValue")
    public JAXBElement<KeyValueType> createKeyValue(KeyValueType value) {
        return new JAXBElement<KeyValueType>(_KeyValue_QNAME, KeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RetrievalMethod")
    public JAXBElement<RetrievalMethodType> createRetrievalMethod(RetrievalMethodType value) {
        return new JAXBElement<RetrievalMethodType>(_RetrievalMethod_QNAME, RetrievalMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509DataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link X509DataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Data")
    public JAXBElement<X509DataType> createX509Data(X509DataType value) {
        return new JAXBElement<X509DataType>(_X509Data_QNAME, X509DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPData")
    public JAXBElement<PGPDataType> createPGPData(PGPDataType value) {
        return new JAXBElement<PGPDataType>(_PGPData_QNAME, PGPDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKIData")
    public JAXBElement<SPKIDataType> createSPKIData(SPKIDataType value) {
        return new JAXBElement<SPKIDataType>(_SPKIData_QNAME, SPKIDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Object")
    public JAXBElement<ObjectType> createObject(ObjectType value) {
        return new JAXBElement<ObjectType>(_Object_QNAME, ObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManifestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ManifestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Manifest")
    public JAXBElement<ManifestType> createManifest(ManifestType value) {
        return new JAXBElement<ManifestType>(_Manifest_QNAME, ManifestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignaturePropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperties")
    public JAXBElement<SignaturePropertiesType> createSignatureProperties(SignaturePropertiesType value) {
        return new JAXBElement<SignaturePropertiesType>(_SignatureProperties_QNAME, SignaturePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignaturePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperty")
    public JAXBElement<SignaturePropertyType> createSignatureProperty(SignaturePropertyType value) {
        return new JAXBElement<SignaturePropertyType>(_SignatureProperty_QNAME, SignaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DSAKeyValue")
    public JAXBElement<DSAKeyValueType> createDSAKeyValue(DSAKeyValueType value) {
        return new JAXBElement<DSAKeyValueType>(_DSAKeyValue_QNAME, DSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RSAKeyValue")
    public JAXBElement<RSAKeyValueType> createRSAKeyValue(RSAKeyValueType value) {
        return new JAXBElement<RSAKeyValueType>(_RSAKeyValue_QNAME, RSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "TimeStampValidationData")
    public JAXBElement<ValidationDataType> createTimeStampValidationData(ValidationDataType value) {
        return new JAXBElement<ValidationDataType>(_TimeStampValidationData_QNAME, ValidationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "ArchiveTimeStampV2")
    public JAXBElement<XAdESTimeStampType> createArchiveTimeStampV2(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_ArchiveTimeStampV2_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKISexp", scope = SPKIDataType.class)
    public JAXBElement<byte[]> createSPKIDataTypeSPKISexp(byte[] value) {
        return new JAXBElement<byte[]>(_SPKIDataTypeSPKISexp_QNAME, byte[].class, SPKIDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPKeyID", scope = PGPDataType.class)
    public JAXBElement<byte[]> createPGPDataTypePGPKeyID(byte[] value) {
        return new JAXBElement<byte[]>(_PGPDataTypePGPKeyID_QNAME, byte[].class, PGPDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPKeyPacket", scope = PGPDataType.class)
    public JAXBElement<byte[]> createPGPDataTypePGPKeyPacket(byte[] value) {
        return new JAXBElement<byte[]>(_PGPDataTypePGPKeyPacket_QNAME, byte[].class, PGPDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509IssuerSerialType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link X509IssuerSerialType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509IssuerSerial", scope = X509DataType.class)
    public JAXBElement<X509IssuerSerialType> createX509DataTypeX509IssuerSerial(X509IssuerSerialType value) {
        return new JAXBElement<X509IssuerSerialType>(_X509DataTypeX509IssuerSerial_QNAME, X509IssuerSerialType.class, X509DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SKI", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509SKI(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509SKI_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SubjectName", scope = X509DataType.class)
    public JAXBElement<String> createX509DataTypeX509SubjectName(String value) {
        return new JAXBElement<String>(_X509DataTypeX509SubjectName_QNAME, String.class, X509DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Certificate", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509Certificate(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509Certificate_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509CRL", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509CRL(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509CRL_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "XPath", scope = TransformType.class)
    public JAXBElement<String> createTransformTypeXPath(String value) {
        return new JAXBElement<String>(_TransformTypeXPath_QNAME, String.class, TransformType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "HMACOutputLength", scope = SignatureMethodType.class)
    public JAXBElement<BigInteger> createSignatureMethodTypeHMACOutputLength(BigInteger value) {
        return new JAXBElement<BigInteger>(_SignatureMethodTypeHMACOutputLength_QNAME, BigInteger.class, SignatureMethodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CounterSignatureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CounterSignatureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CounterSignature", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<CounterSignatureType> createUnsignedSignaturePropertiesTypeCounterSignature(CounterSignatureType value) {
        return new JAXBElement<CounterSignatureType>(_CounterSignature_QNAME, CounterSignatureType.class, UnsignedSignaturePropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SignatureTimeStamp", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<XAdESTimeStampType> createUnsignedSignaturePropertiesTypeSignatureTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_SignatureTimeStamp_QNAME, XAdESTimeStampType.class, UnsignedSignaturePropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CompleteCertificateRefs", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<CompleteCertificateRefsType> createUnsignedSignaturePropertiesTypeCompleteCertificateRefs(CompleteCertificateRefsType value) {
        return new JAXBElement<CompleteCertificateRefsType>(_CompleteCertificateRefs_QNAME, CompleteCertificateRefsType.class, UnsignedSignaturePropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CompleteRevocationRefs", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<CompleteRevocationRefsType> createUnsignedSignaturePropertiesTypeCompleteRevocationRefs(CompleteRevocationRefsType value) {
        return new JAXBElement<CompleteRevocationRefsType>(_CompleteRevocationRefs_QNAME, CompleteRevocationRefsType.class, UnsignedSignaturePropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeCertificateRefs", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<CompleteCertificateRefsType> createUnsignedSignaturePropertiesTypeAttributeCertificateRefs(CompleteCertificateRefsType value) {
        return new JAXBElement<CompleteCertificateRefsType>(_AttributeCertificateRefs_QNAME, CompleteCertificateRefsType.class, UnsignedSignaturePropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeRevocationRefs", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<CompleteRevocationRefsType> createUnsignedSignaturePropertiesTypeAttributeRevocationRefs(CompleteRevocationRefsType value) {
        return new JAXBElement<CompleteRevocationRefsType>(_AttributeRevocationRefs_QNAME, CompleteRevocationRefsType.class, UnsignedSignaturePropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SigAndRefsTimeStamp", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<XAdESTimeStampType> createUnsignedSignaturePropertiesTypeSigAndRefsTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_SigAndRefsTimeStamp_QNAME, XAdESTimeStampType.class, UnsignedSignaturePropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "RefsOnlyTimeStamp", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<XAdESTimeStampType> createUnsignedSignaturePropertiesTypeRefsOnlyTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_RefsOnlyTimeStamp_QNAME, XAdESTimeStampType.class, UnsignedSignaturePropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CertificateValues", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<CertificateValuesType> createUnsignedSignaturePropertiesTypeCertificateValues(CertificateValuesType value) {
        return new JAXBElement<CertificateValuesType>(_CertificateValues_QNAME, CertificateValuesType.class, UnsignedSignaturePropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "RevocationValues", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<RevocationValuesType> createUnsignedSignaturePropertiesTypeRevocationValues(RevocationValuesType value) {
        return new JAXBElement<RevocationValuesType>(_RevocationValues_QNAME, RevocationValuesType.class, UnsignedSignaturePropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttrAuthoritiesCertValues", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<CertificateValuesType> createUnsignedSignaturePropertiesTypeAttrAuthoritiesCertValues(CertificateValuesType value) {
        return new JAXBElement<CertificateValuesType>(_AttrAuthoritiesCertValues_QNAME, CertificateValuesType.class, UnsignedSignaturePropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeRevocationValues", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<RevocationValuesType> createUnsignedSignaturePropertiesTypeAttributeRevocationValues(RevocationValuesType value) {
        return new JAXBElement<RevocationValuesType>(_AttributeRevocationValues_QNAME, RevocationValuesType.class, UnsignedSignaturePropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "ArchiveTimeStamp", scope = UnsignedSignaturePropertiesType.class)
    public JAXBElement<XAdESTimeStampType> createUnsignedSignaturePropertiesTypeArchiveTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_ArchiveTimeStamp_QNAME, XAdESTimeStampType.class, UnsignedSignaturePropertiesType.class, value);
    }

}
