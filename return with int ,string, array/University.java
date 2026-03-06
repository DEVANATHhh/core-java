 class University{
 
 static String [] getCoursesByCollegeName(String name){
	 
	 System.out.println("The course name is  :"+name);
	 
	 if(name==null){
		 System.out.println("The college name is invalid ");
		 return null;
	 }
	 

String [] sditCourse = {"CSE","ISE","MCA"};
String [] iitCourse = {"CSE","Electrical Engineering","Mechanical Engineering"};
String [] rvceCourse = {"BE CSE","BE Mechanical","BE Civil"};
String [] bmsceCourse = {"BE CSE","BE ECE","MTech"};
String [] pesCourse = {"BTech CSE","BBA","MBA"};
String [] nitkCourse = {"BTech Civil","MTech","MBA"};
String [] christCourse = {"BCom","BBA","MBA"};
String [] nlsiuCourse = {"BA LLB","LLM","PhD Law"};
String [] iimbCourse = {"MBA","Executive MBA","PhD"};
String [] bmcriCourse = {"MBBS","MD","MS"};
String [] kmcCourse = {"MBBS","MD","MS"};
String [] jssCourse = {"MBBS","MD","MS"};
String [] ramaiahCourse = {"BE CSE","BE Civil","MTech"};
String [] dayanandaCourse = {"BE CSE","BE Mechanical","MBA"};
String [] sjceCourse = {"BE CSE","BE ECE","MTech"};
String [] kleCourse = {"BE Civil","BE Mechanical","MBA"};
String [] mountcarmelCourse = {"BA","BSc","BCom"};
String [] stjosephCourse = {"BA English","BSc Physics","BCom"};
String [] bangaloreUniCourse = {"BA","BSc","MSc"};
String [] mysoreUniCourse = {"BA","MSc","PhD"};
String [] manipalCourse = {"BTech CSE","BTech ECE","MTech"};
String [] mangaloreUniCourse = {"BA","BSc","MSc"};
String [] kleMedicalCourse = {"MBBS","MD","MS"};
String [] jnmcCourse = {"MBBS","MD","MS"};
String [] bapujiCourse = {"BE CSE","BE Mechanical","MTech"};
String [] dayanandaSagarUniCourse = {"BTech","MBA","PhD"};
String [] presidencyCourse = {"BTech CSE","BBA","MBA"};
String [] revaCourse = {"BTech","BCom","MBA"};
String [] cmritCourse = {"BE CSE","BE ECE","MTech"};
String [] nhceCourse = {"BE CSE","MBA","MCA"};
String [] sjbitCourse = {"BE Civil","BE CSE","MTech"};
String [] acharyaCourse = {"BE Mechanical","MBA","MCA"};
String [] eastpointCourse = {"BE CSE","MBA","BPharm"};
String [] allianceCourse = {"BBA","MBA","LLB"};
String [] gardenCityCourse = {"BCom","MBA","BCA"};
String [] oxfordCourse = {"BE CSE","MBA","MCA"};
String [] adichunchanagiriCourse = {"BE Civil","BE Mechanical","MTech"};
String [] basaveshwarCourse = {"BE CSE","BE ECE","MTech"};
String [] gmitCourse = {"BE CSE","BE Civil","MBA"};
String [] klsGogteCourse = {"BE CSE","BE Mechanical","MTech"};
String [] amcecCourse = {"BE CSE","BE ECE","MBA"};
String [] rajivGandhiCourse = {"MBBS","BDS","BPharm"};
String [] ksouCourse = {"BA","BCom","MBA"};
String [] kuvempuCourse = {"BA","MSc","PhD"};
String [] tumkurUniCourse = {"BA","BSc","MCom"};
String [] raniChennammaCourse = {"BA","MSc","PhD"};
String [] gulbargaUniCourse = {"BA","MCom","PhD"};
String [] davangereUniCourse = {"BSc","MBA","PhD"};
String [] bidarUniCourse = {"BA","BCom","MSc"};
String [] mysoreMedicalCourse = {"MBBS","MD","MS"};
String [] stJohnsCourse = {"MBBS","MD","MSc Medical"};
String [] fatherMullerCourse = {"MBBS","MD","MS"};
String [] alAmeenCourse = {"MBBS","MD","MS"};
String [] sapthagiriCourse = {"MBBS","MD","MS"};
String [] narayanaCourse = {"MBBS","MD","MS"};
String [] akashCourse = {"MBBS","MD","MS"};
String [] vydehiCourse = {"MBBS","MD","MS"};
String [] kempegowdaCourse = {"MBBS","MD","MS"};
String [] kimsHubliCourse = {"MBBS","MD","MS"};
String [] sdmcCourse = {"MBBS","MD","MS"};
String [] atriaCourse = {"BE CSE","BE ECE","MBA"};
String [] brceCourse = {"BE Civil","BE Mechanical","MTech"};
String [] bnmitCourse = {"BE CSE","BE ISE","MCA"};
String [] brindavanCourse = {"BE CSE","BE Mechanical","MBA"};
String [] cambridgeCourse = {"BE CSE","MBA","MTech"};
String [] canaraCourse = {"BE Civil","BE CSE","MTech"};
String [] dayanandaInstCourse = {"BE CSE","BE Mechanical","MBA"};
String [] dsatmCourse = {"BE CSE","BE ECE","MTech"};
String [] globalCourse = {"BE CSE","MBA","MCA"};
String [] hkbkCourse = {"BE CSE","BE ECE","MBA"};
String [] jainCourse = {"BBA","MBA","BCom"};
String [] kvgCourse = {"BE Civil","BE Mechanical","MBA"};
String [] kctCourse = {"BE CSE","BE Civil","MTech"};
String [] knsCourse = {"BE CSE","BE ECE","MBA"};
String [] lordsCourse = {"BE Mechanical","BE Civil","MBA"};
String [] mvjCourse = {"BE CSE","BE ECE","MTech"};
String [] nitteCourse = {"BTech CSE","BTech Mechanical","MBA"};
String [] oxfordMedCourse = {"MBBS","MD","MS"};
String [] pesceCourse = {"BE Civil","BE Mechanical","MBA"};
String [] rajarajeshwariCourse = {"BE CSE","MBA","MTech"};
String [] rnsitCourse = {"BE CSE","BE Civil","MTech"};
String [] sdmEnggCourse = {"BE CSE","BE Mechanical","MBA"};
String [] sambhramCourse = {"BE CSE","BE ECE","MBA"};
String [] sapthagiriEnggCourse = {"BE CSE","BE Civil","MTech"};
String [] siddagangaCourse = {"BE CSE","BE ECE","MTech"};
String [] sirMVITCourse = {"BE CSE","BE Mechanical","MBA"};
String [] srinivasCourse = {"BE CSE","MBA","MTech"};
String [] stMaryCourse = {"BA","BCom","BSc"};
String [] stPhilomenaCourse = {"BA","BCom","BSc"};
String [] tJohnCourse = {"BBA","MBA","BCom"};
String [] vtuCourse = {"BE","MTech","PhD"};
String [] vviEtCourse = {"BE CSE","BE ECE","MBA"};
String [] dayanandaPolyCourse = {"Diploma Civil","Diploma Mechanical","Diploma CSE"};
String [] govtPolyBlrCourse = {"Diploma Civil","Diploma ECE","Diploma Mechanical"};
String [] govtPolyMysCourse = {"Diploma Civil","Diploma CSE","Diploma Mechanical"};
String [] klePharmaCourse = {"BPharm","MPharm","PhD"};
String [] manipalPharmaCourse = {"BPharm","MPharm","PhD"};
String [] vtuBelagaviCourse = {"BE","MTech","PhD"};
String [] vijayaCollegeCourse = {"BA","BCom","BSc"};
String [] yuvarajaCourse = {"BA","BSc","MSc"};
String [] acharyaPolyCourse = {"Diploma Civil","Diploma Mechanical","Diploma CSE"};
String [] adityaEnggCourse = {"BE CSE","BE ECE","MBA"};
String [] alvasCourse = {"BE CSE","BBA","MBA"};
String [] amityCourse = {"BTech CSE","BBA","MBA"};
String [] apsCollegeCourse = {"BE CSE","BE Mechanical","MBA"};
String [] atriaMedCourse = {"MBBS","MD","MS"};
String [] bapujiPharmaCourse = {"BPharm","MPharm","PhD"};
String [] bearysCourse = {"BE CSE","BE Civil","MBA"};
String [] bitmCourse = {"BE CSE","BE ECE","MBA"};
String [] brindavanDegreeCourse = {"BA","BCom","BSc"};
String [] cmrUniCourse = {"BTech","MBA","BBA"};
String [] coorgInstCourse = {"BE CSE","BE Mechanical","MBA"};
String [] dayanandaLawCourse = {"LLB","BA LLB","LLM"};
String [] eastWestCourse = {"BE CSE","BE ECE","MBA"};
String [] gokulCourse = {"BTech","MBA","BCom"};
String [] gowthamCourse = {"BSc Nursing","GNM","MSc Nursing"};
String [] impactCourse = {"BBA","MBA","BCom"};
String [] jssLawCourse = {"LLB","BA LLB","LLM"};
String [] karnatakaLawCourse = {"LLB","BA LLB","LLM"};
String [] kleLawCourse = {"LLB","BA LLB","LLM"};
String [] klePharmaBelgaumCourse = {"BPharm","MPharm","PhD"};
String [] krupanidhiCourse = {"BPharm","MPharm","PhD"};
String [] malnadEnggCourse = {"BE CSE","BE Civil","MTech"};
String [] mceHassanCourse = {"BE CSE","BE Mechanical","MBA"};
String [] navodayaCourse = {"MBBS","MD","MS"};
String [] newHorizonMedCourse = {"MBBS","MD","MS"};
String [] nittePharmaCourse = {"BPharm","MPharm","PhD"};
String [] oxfordDegreeCourse = {"BA","BCom","BSc"};
String [] pesitCourse = {"BE CSE","BE ECE","MBA"};
String [] presidencyDegreeCourse = {"BCom","BBA","MBA"};
String [] sharnbasvaCourse = {"BTech CSE","MBA","PhD"};
String [] shrideviCourse = {"BE CSE","BE Civil","MBA"};
String [] siddagangaPharmaCourse = {"BPharm","MPharm","PhD"};
String [] stAloysiusCourse = {"BA","BCom","BSc"};
String [] stClaretCourse = {"BCom","BBA","MBA"};
String [] stJosephsLawCourse = {"LLB","BA LLB","LLM"};
String [] tumkurMedicalCourse = {"MBBS","MD","MS"};
String [] vtuResearchCourse = {"MTech","PhD","MBA"};
String [] vishweshwarayaCourse = {"BArch","MArch","PhD"};
String [] vivekanandaCourse = {"BA","BCom","BSc"};
String [] vvPuramCourse = {"BA","BSc","BCom"};
String [] dayanandaArtsCourse = {"BA","BSc","MCom"};
String [] bangaloreMedCourse = {"MBBS","MD","MS"};
String [] belgaumInstCourse = {"MBBS","MD","MS"};
String [] bidarMedCourse = {"MBBS","MD","MS"};
String [] kolarMedCourse = {"MBBS","MD","MS"};
String [] raichurInstCourse = {"MBBS","MD","MS"};
String [] madhugiriCollegeCourse = {"BA","BCom","BSc"};
String [] gubbiInstCourse = {"BA","BSc","BCom"};
String [] kunigalCollegeCourse = {"BCom","BBA","MBA"};
String [] tipturCollegeCourse = {"BA","BSc","BCom"};
String [] arsikereInstCourse = {"BE Civil","BE Mechanical","MBA"};
String [] hosadurgaCollegeCourse = {"BA","BCom","BSc"};
String [] challakereInstCourse = {"BSc","BCom","BA"};
String [] hiriyurCollegeCourse = {"BA","BCom","BSc"};
String [] molakalmuruInstCourse = {"BA","BSc","BCom"};
String [] mudigereCollegeCourse = {"BCom","BSc","BA"};
String [] kadurInstCourse = {"BA","BCom","BSc"};
String [] koppaCollegeCourse = {"BSc","BA","BCom"};
String [] narasimharajapuraCourse = {"BA","BSc","BCom"};
String [] somwarpetCourse = {"BCom","BSc","BA"};
String [] virajpetCourse = {"BA","BCom","BSc"};
String [] madikeriInstCourse = {"BSc","MBA","BCom"};
String [] siruguppaCourse = {"BA","BSc","BCom"};
String [] sandurInstCourse = {"BCom","BSc","BA"};
String [] kudligiCourse = {"BA","BCom","BSc"};
String [] harapanahalliCourse = {"BSc","BCom","BA"};
String [] jagalurCourse = {"BA","BSc","BCom"};
String [] holalkereCourse = {"BCom","BA","BSc"};
String [] shikaripuraCourse = {"BA","BSc","BCom"};
String [] sorabCourse = {"BCom","BSc","BA"};
String [] sagarCollegeCourse = {"BA","BCom","BSc"};
String [] thirthahalliCourse = {"BSc","BA","BCom"};
String [] bhadravatiCourse = {"BE CSE","BE Mechanical","MBA"};
String [] shimogaRuralCourse = {"BA","BCom","BSc"};
String [] kanakapuraCourse = {"BCom","BSc","BA"};
String [] magadiCourse = {"BA","BSc","BCom"};
String [] channapatnaCourse = {"BCom","BA","BSc"};
String [] siraCollegeCourse = {"BA","BCom","BSc"};
String [] huliyarCourse = {"BSc","BCom","BA"};
String [] kollegalCourse = {"BA","BSc","BCom"};
String [] yelandurCourse = {"BCom","BSc","BA"};
String [] piriyapatnaCourse = {"BA","BSc","BCom"};
String [] krNagarCourse = {"BCom","BSc","BA"};
String [] hunasuruCourse = {"BA","BSc","BCom"};
String [] saligramaCourse = {"BSc","BCom","BA"};
String [] malavalliCourse = {"BA","BCom","BSc"};
String [] srirangapatnaCourse = {"BSc","BA","BCom"};
String [] pandavapuraCourse = {"BA","BSc","BCom"};
String [] nagamangalaCourse = {"BCom","BSc","BA"};
String [] alurCollegeCourse = {"BA","BCom","BSc"};
String [] arakalgudCourse = {"BSc","BA","BCom"};
String [] belurCourse = {"BA","BCom","BSc"};
String [] moodigereRuralCourse = {"BCom","BSc","BA"};
String [] sringeriInstCourse = {"BA","BSc","BCom"};
String [] udupiRuralCourse = {"BCom","BSc","BA"};
String [] karkalaCourse = {"BA","BSc","BCom"};
String [] bantwalInstCourse = {"BCom","BSc","BA"};
String [] moodbidriCollegeCourse = {"BA","BCom","BSc"};
String [] suliaCollegeCourse = {"BSc","BA","BCom"};
String [] putturInstCourse = {"BCom","BSc","MBA"};
String [] belthangadyCourse = {"BA","BSc","BCom"};
String [] kundapuraInstCourse = {"BCom","BA","BSc"};
String [] hebriCourse = {"BA","BSc","BCom"};
String [] byndoorCollegeCourse = {"BSc","BCom","BA"};
String [] karkalaInstCourse = {"BA","BSc","BCom"};
String [] brahmavarCourse = {"BCom","BA","BSc"};
String [] honnavarInstCourse = {"BA","BSc","BCom"};
String [] kumtaCourse = {"BSc","BCom","BA"};
String [] bhetkalCourse = {"BA","BCom","BSc"};
String [] ankolaCollegeCourse = {"BSc","BA","BCom"};
String [] yellapurCourse = {"BCom","BSc","BA"};
String [] sirsiCollegeCourse = {"BA","BSc","BCom"};
String [] siddapurCourse = {"BSc","BCom","BA"};
String [] mundgodCourse = {"BA","BCom","BSc"};
String [] haveriInstCourse = {"BSc","BA","BCom"};
String [] ranebennurCourse = {"BCom","BSc","BA"};
String [] shiggaonCourse = {"BA","BSc","BCom"};
String [] savanurCourse = {"BSc","BCom","BA"};
String [] hungundCourse = {"BA","BCom","BSc"};
String [] mudholCourse = {"BSc","BA","BCom"};
String [] rabkaviCourse = {"BCom","BSc","BA"};
String [] jamkhandiCourse = {"BA","BSc","BCom"};
String [] ilkalCourse = {"BSc","BCom","BA"};
String [] sindagiCourse = {"BA","BCom","BSc"};
String [] indiCourse = {"BSc","BA","BCom"};
String [] muddebihalCourse = {"BCom","BSc","BA"};
String [] basavanaBagewadiCourse = {"BA","BSc","BCom"};
String [] nargundCourse = {"BSc","BCom","BA"};
String [] gajendragadCourse = {"BA","BCom","BSc"};
String [] ronCourse = {"BSc","BA","BCom"};
String [] kalghatgiCourse = {"BCom","BSc","BA"};
String [] navalgundCourse = {"BA","BSc","BCom"};
String [] kundgolCourse = {"BSc","BCom","BA"};
String [] annigeriCourse = {"BA","BCom","BSc"};
String [] alnavarCourse = {"BSc","BA","BCom"};
String [] shirahattiCourse = {"BA","BSc","BCom"};
String [] lakshmeshwarCourse = {"BCom","BA","BSc"};
String [] shirsiRuralCourse = {"BA","BSc","BCom"};
String [] gokakCollegeCourse = {"BSc","BCom","BA"};
String [] bailhongalCourse = {"BA","BCom","BSc"};
String [] ramdurgCourse = {"BSc","BA","BCom"};
String [] chikkodiCourse = {"BCom","BSc","BA"};
String [] athaniCollegeCourse = {"BA","BSc","BCom"};
String [] saundattiInstCourse = {"BSc","BCom","BA"};
String [] hukkeriCourse = {"BA","BCom","BSc"};
String [] sankeshwarCourse = {"BSc","BA","BCom"};





if(name=="sdit"){
    return sditCourse;
}

if(name=="iit"){
    return iitCourse;
}

if(name=="rvce"){
    return rvceCourse;
}

if(name=="bmsce"){
    return bmsceCourse;
}

if(name=="pes"){
    return pesCourse;
}

if(name=="nitk"){
    return nitkCourse;
}

if(name=="christ"){
    return christCourse;
}

if(name=="nlsiu"){
    return nlsiuCourse;
}

if(name=="iimb"){
    return iimbCourse;
}

if(name=="bmcri"){
    return bmcriCourse;
}

if(name=="kmc"){
    return kmcCourse;
}

if(name=="jss"){
    return jssCourse;
}

if(name=="ramaiah"){
    return ramaiahCourse;
}

if(name=="dayananda"){
    return dayanandaCourse;
}

if(name=="sjce"){
    return sjceCourse;
}

if(name=="kle"){
    return kleCourse;
}

if(name=="mountcarmel"){
    return mountcarmelCourse;
}

if(name=="stjoseph"){
    return stjosephCourse;
}

if(name=="bangaloreUni"){
    return bangaloreUniCourse;
}

if(name=="mysoreUni"){
    return mysoreUniCourse;
}

if(name=="manipal"){
    return manipalCourse;
}

if(name=="mangaloreUni"){
    return mangaloreUniCourse;
}

if(name=="kleMedical"){
    return kleMedicalCourse;
}

if(name=="jnmc"){
    return jnmcCourse;
}

if(name=="bapuji"){
    return bapujiCourse;
}

if(name=="dayanandaSagarUni"){
    return dayanandaSagarUniCourse;
}

if(name=="presidency"){
    return presidencyCourse;
}

if(name=="reva"){
    return revaCourse;
}

if(name=="cmrit"){
    return cmritCourse;
}

if(name=="nhce"){
    return nhceCourse;
}

if(name=="sjbit"){
    return sjbitCourse;
}

if(name=="acharya"){
    return acharyaCourse;
}

if(name=="eastpoint"){
    return eastpointCourse;
}

if(name=="alliance"){
    return allianceCourse;
}

if(name=="gardenCity"){
    return gardenCityCourse;
}

if(name=="oxford"){
    return oxfordCourse;
}

if(name=="adichunchanagiri"){
    return adichunchanagiriCourse;
}

if(name=="basaveshwar"){
    return basaveshwarCourse;
}

if(name=="gmit"){
    return gmitCourse;
}

if(name=="klsGogte"){
    return klsGogteCourse;
}

if(name=="amcec"){
    return amcecCourse;
}

if(name=="rajivGandhi"){
    return rajivGandhiCourse;
}

if(name=="ksou"){
    return ksouCourse;
}

if(name=="kuvempu"){
    return kuvempuCourse;
}

if(name=="tumkurUni"){
    return tumkurUniCourse;
}

if(name=="raniChennamma"){
    return raniChennammaCourse;
}

if(name=="gulbargaUni"){
    return gulbargaUniCourse;
}

if(name=="davangereUni"){
    return davangereUniCourse;
}

if(name=="bidarUni"){
    return bidarUniCourse;
}

if(name=="mysoreMedical"){
    return mysoreMedicalCourse;
}

if(name=="stJohns"){
    return stJohnsCourse;
}

if(name=="fatherMuller"){
    return fatherMullerCourse;
}

if(name=="alAmeen"){
    return alAmeenCourse;
}

if(name=="sapthagiri"){
    return sapthagiriCourse;
}

if(name=="narayana"){
    return narayanaCourse;
}

if(name=="akash"){
    return akashCourse;
}

if(name=="vydehi"){
    return vydehiCourse;
}

if(name=="kempegowda"){
    return kempegowdaCourse;
}

if(name=="kimsHubli"){
    return kimsHubliCourse;
}

if(name=="sdmc"){
    return sdmcCourse;
}

if(name=="atria"){
    return atriaCourse;
}

if(name=="brce"){
    return brceCourse; 
}

if(name=="bnmit"){
    return bnmitCourse;
}

if(name=="brindavan"){ 
    return brindavanCourse;
}
 
if(name=="cambridge"){
    return cambridgeCourse;
}
 
if(name=="canara"){
    return canaraCourse; 
}
 
if(name=="dayanandaInst"){
    return dayanandaInstCourse; 
}
 
if(name=="dsatm"){ 
    return dsatmCourse;
}

if(name=="global"){
    return globalCourse;
}
 
if(name=="hkbk"){
    return hkbkCourse;
}
 
if(name=="jain"){
    return jainCourse;
}
 
if(name=="kvg"){
    return kvgCourse; 
}
 
if(name=="kct"){
    return kctCourse; 
}
 
if(name=="kns"){
    return knsCourse;
}
 
if(name=="lords"){
    return lordsCourse;
}
 
if(name=="mvj"){
    return mvjCourse;
}
 
if(name=="nitte"){
    return nitteCourse;
}
 
if(name=="oxfordMed"){
    return oxfordMedCourse; 
}
 
if(name=="pesce"){
    return pesceCourse; 
}
 
if(name=="rajarajeshwari"){
    return rajarajeshwariCourse;
}
 
if(name=="rnsit"){
    return rnsitCourse; 
}
 
if(name=="sdmEngg"){
    return sdmEnggCourse;
}
 
if(name=="sambhram"){ 
    return sambhramCourse; 
}
 
if(name=="sapthagiriEngg"){ 
    return sapthagiriEnggCourse;
}
 
if(name=="siddaganga"){
    return siddagangaCourse;
}
 
if(name=="sirMVIT"){ 
    return sirMVITCourse;
}
 
if(name=="srinivas"){ 
    return srinivasCourse; 
}
 
if(name=="stMary"){
    return stMaryCourse; 
}
 
if(name=="stPhilomena"){
    return stPhilomenaCourse;
}
 
if(name=="tJohn"){ 
    return tJohnCourse;
}
 
if(name=="vtu"){
    return vtuCourse;
}
 
if(name=="vviEt"){ 
    return vviEtCourse; 
}
 
if(name=="dayanandaPoly"){
    return dayanandaPolyCourse; 
}
 
if(name=="govtPolyBlr"){
    return govtPolyBlrCourse;
}
 
if(name=="govtPolyMys"){ 
    return govtPolyMysCourse;
}
 
if(name=="klePharma"){ 
    return klePharmaCourse;
}
 
if(name=="manipalPharma"){
    return manipalPharmaCourse;
}
 
if(name=="vtuBelagavi"){ 
    return vtuBelagaviCourse;
}
 
if(name=="vijayaCollege"){ 
    return vijayaCollegeCourse; 
}

if(name=="yuvaraja"){
    return yuvarajaCourse; 
}

if(name=="Acharya Polytechnic")
{
    return acharyaPolyCourse;
}

if(name=="Aditya Institute of Technology")
{
    return adityaEnggCourse;
}

if(name=="Alvas Institute of Engineering")
{
    return alvasCourse;
}

if(name=="Amity University Bengaluru")
{
    return amityCourse;
}

if(name=="APS College of Engineering")
{
    return apsCollegeCourse;
}

if(name=="Atria Medical College")
{
    return atriaMedCourse;
}

if(name=="Bapuji Pharmacy College")
{
    return bapujiPharmaCourse;
}

if(name=="Bearys Institute of Technology")
{
    return bearysCourse;
}

if(name=="Ballari Institute of Technology and Management")
{
    return bitmCourse;
}

if(name=="Brindavan Degree College")
{
    return brindavanDegreeCourse;
}

if(name=="CMR University")
{
    return cmrUniCourse;
}

if(name=="Coorg Institute of Technology")
{
    return coorgInstCourse;
}

if(name=="Dayananda Sagar College of Law")
{
    return dayanandaLawCourse;
}

if(name=="East West Institute of Technology")
{
    return eastWestCourse;
}

if(name=="Gokul Global University")
{
    return gokulCourse;
}

if(name=="Gowtham College of Nursing")
{
    return gowthamCourse;
}

if(name=="Impact College Bengaluru")
{
    return impactCourse;
}

if(name=="JSS Law College Mysuru")
{
    return jssLawCourse;
}

if(name=="Karnataka Law College")
{
    return karnatakaLawCourse;
}

if(name=="KLE Society Law College")
{
    return kleLawCourse;
}

if(name=="KLE College of Pharmacy Belagavi")
{
    return klePharmaBelgaumCourse;
}

if(name=="Krupanidhi College of Pharmacy")
{
    return krupanidhiCourse;
}

if(name=="Malnad College of Engineering")
{
    return malnadEnggCourse;
}

if(name=="MCE Hassan")
{
    return mceHassanCourse;
}

if(name=="Navodaya Medical College")
{
    return navodayaCourse;
}

if(name=="New Horizon Medical College")
{
    return newHorizonMedCourse;
}

if(name=="Nitte College of Pharmacy")
{
    return nittePharmaCourse;
}

if(name=="Oxford Degree College")
{
    return oxfordDegreeCourse;
}

if(name=="PES Institute of Technology")
{
    return pesitCourse;
}

if(name=="Presidency Degree College")
{
    return presidencyDegreeCourse;
}


if(name=="Sharnbasva University")
{
    return sharnbasvaCourse;
}

if(name=="Shridevi Institute of Engineering")
{
    return shrideviCourse;
}

if(name=="Siddaganga College of Pharmacy")
{
    return siddagangaPharmaCourse;
}

if(name=="St Aloysius College Mangaluru")
{
    return stAloysiusCourse;
}

if(name=="St Claret College")
{
    return stClaretCourse;
}

if(name=="St Josephs College of Law")
{
    return stJosephsLawCourse;
}

if(name=="Tumkur Medical College")
{
    return tumkurMedicalCourse;
}

if(name=="VTU Research Centre")
{
    return vtuResearchCourse;
}

if(name=="Visvesvaraya College of Architecture")
{
    return vishweshwarayaCourse;
}

if(name=="Vivekananda College Puttur")
{
    return vivekanandaCourse;
}

if(name=="VV Puram College Bengaluru")
{
    return vvPuramCourse;
}

if(name=="Dayananda Arts College")
{
    return dayanandaArtsCourse;
}

if(name=="Bangalore Medical College")
{
    return bangaloreMedCourse;
}

if(name=="Belgaum Institute of Medical Sciences")
{
    return belgaumInstCourse;
}

if(name=="Bidar Institute of Medical Sciences")
{
    return bidarMedCourse;
}

if(name=="Kolar Medical College")
{
    return kolarMedCourse;
}

if(name=="Raichur Institute of Medical Sciences")
{
    return raichurInstCourse;
}

if(name=="Madhugiri College")
{
    return madhugiriCollegeCourse;
}

if(name=="Gubbi Institute")
{
    return gubbiInstCourse;
}

if(name=="Kunigal College")
{
    return kunigalCollegeCourse;
}

if(name=="Tiptur College")
{
    return tipturCollegeCourse;
}

if(name=="Arsikere Institute")
{
    return arsikereInstCourse;
}

if(name=="Hosadurga College")
{
    return hosadurgaCollegeCourse;
}

if(name=="Challakere Institute")
{
    return challakereInstCourse;
}

if(name=="Hiriyur College")
{
    return hiriyurCollegeCourse;
}

if(name=="Molakalmuru Institute")
{
    return molakalmuruInstCourse;
}

if(name=="Mudige College")
{
    return mudigereCollegeCourse;
}

if(name=="Kadur Institute")
{
    return kadurInstCourse;
}

if(name=="Koppa College")
{
    return koppaCollegeCourse;
}

if(name=="Narasimharajapura College")
{
    return narasimharajapuraCourse;
}

if(name=="Somwarpet College")
{
    return somwarpetCourse;
}

if(name=="Virajpet College")
{
    return virajpetCourse;
}

if(name=="Madikeri Institute")
{
    return madikeriInstCourse;
}

if(name=="Siruguppa College")
{
    return siruguppaCourse;
}

if(name=="Sandur Institute")
{
    return sandurInstCourse;
}

if(name=="Kudligi College")
{
    return kudligiCourse;
}

if(name=="Harapanahalli College")
{
    return harapanahalliCourse;
}

if(name=="Jagalur College")
{
    return jagalurCourse;
}

if(name=="Holalkere College")
{
    return holalkereCourse;
}

if(name=="Shikaripura College")
{
    return shikaripuraCourse;
}

if(name=="Sorab College")
{
    return sorabCourse;
}

if(name=="Sagar College")
{
    return sagarCollegeCourse;
}

if(name=="Thirthahalli College")
{
    return thirthahalliCourse;
}

if(name=="Bhadravati College")
{
    return bhadravatiCourse;
}

if(name=="Shimoga Rural College")
{
    return shimogaRuralCourse;
}

if(name=="Kanakapura College")
{
    return kanakapuraCourse;
}

if(name=="Magadi College")
{
    return magadiCourse;
}

if(name=="Channapatna College")
{
    return channapatnaCourse;
}

if(name=="Sira College")
{
    return siraCollegeCourse;
}

if(name=="Huliyar College")
{
    return huliyarCourse;
}

if(name=="Kollegal College")
{
    return kollegalCourse;
}

if(name=="Yelandur College")
{
    return yelandurCourse;
}

if(name=="Piriyapatna College")
{
    return piriyapatnaCourse;
}

if(name=="Kr Nagar College")
{
    return krNagarCourse;
}

if(name=="Hunasuru College")
{
    return hunasuruCourse;
}

if(name=="Saligrama College")
{
    return saligramaCourse;
}

if(name=="Malavalli College")
{
    return malavalliCourse;
}

if(name=="Srirangapatna College")
{
    return srirangapatnaCourse;
}

if(name=="Pandavapura College")
{
    return pandavapuraCourse;
}

if(name=="Nagamangala College")
{
    return nagamangalaCourse;
}

if(name=="Alur College")
{
    return alurCollegeCourse;
}

if(name=="Arakalgud College")
{
    return arakalgudCourse;
}

if(name=="Belur College")
{
    return belurCourse;
}

if(name=="Moodigere Rural College")
{
    return moodigereRuralCourse;
}

if(name=="Sringeri Institute")
{
    return sringeriInstCourse;
}

if(name=="Udupi Rural College")
{
    return udupiRuralCourse;
}

if(name=="Karkala College")
{
    return karkalaCourse;
}

if(name=="Bantwal Institute")
{
    return bantwalInstCourse;
}

if(name=="Moodbidri College")
{
    return moodbidriCollegeCourse;
}

if(name=="Sulia College")
{
    return suliaCollegeCourse;
}

if(name=="Puttur Institute")
{
    return putturInstCourse;
}

if(name=="Belthangady College")
{
    return belthangadyCourse;
}

if(name=="Kundapura Institute")
{
    return kundapuraInstCourse;
}

if(name=="Hebri College")
{
    return hebriCourse;
}

if(name=="Byndoor College")
{
    return byndoorCollegeCourse;
}

if(name=="Karkala Institute")
{
    return karkalaInstCourse;
}

if(name=="Brahmavar College")
{
    return brahmavarCourse;
}

if(name=="Honnavar Institute")
{
    return honnavarInstCourse;
}

if(name=="Kumta College")
{
    return kumtaCourse;
}

if(name=="Bhetkal College")
{
    return bhetkalCourse;
}

if(name=="Ankola College")
{
    return ankolaCollegeCourse;
}

if(name=="Yellapur College")
{
    return yellapurCourse;
}

if(name=="Sirsi College")
{
    return sirsiCollegeCourse;
}

if(name=="Siddapur College")
{
    return siddapurCourse;
}

if(name=="Mundgod College")
{
    return mundgodCourse;
}

if(name=="Haveri Institute")
{
    return haveriInstCourse;
}

if(name=="Ranebennur College")
{
    return ranebennurCourse;
}

if(name=="Shiggaon College")
{
    return shiggaonCourse;
}

if(name=="Savanur College")
{
    return savanurCourse;
}

if(name=="Hungund College")
{
    return hungundCourse;
}

if(name=="Mudhol College")
{
    return mudholCourse;
}

if(name=="Rabkavi College")
{
    return rabkaviCourse;
}

if(name=="Jamkhandi College")
{
    return jamkhandiCourse;
}

if(name=="Ilkal College")
{
    return ilkalCourse;
}

if(name=="Sindagi College")
{
    return sindagiCourse;
}

if(name=="Indi College")
{
    return indiCourse;
}

if(name=="Muddebihal College")
{
    return muddebihalCourse;
}

if(name=="Basavana Bagewadi College")
{
    return basavanaBagewadiCourse;
}

if(name=="Nargund College")
{
    return nargundCourse;
}

if(name=="Gajendragad College")
{
    return gajendragadCourse;
}

if(name=="Ron College")
{
    return ronCourse;
}

if(name=="Kalghatgi College")
{
    return kalghatgiCourse;
}

if(name=="Navalgund College")
{
    return navalgundCourse;
}

if(name=="Kundgol College")
{
    return kundgolCourse;
}

if(name=="Annigeri College")
{
    return annigeriCourse;
}

if(name=="Alnavar College")
{
    return alnavarCourse;
}

if(name=="Shirahatti College")
{
    return shirahattiCourse;
}

if(name=="Lakshmeshwar College")
{
    return lakshmeshwarCourse;
}

if(name=="Shirsi Rural College")
{
    return shirsiRuralCourse;
}

if(name=="Gokak College")
{
    return gokakCollegeCourse;
}

if(name=="Bailhongal College")
{
    return bailhongalCourse;
}

if(name=="Ramdurg College")
{
    return ramdurgCourse;
}

if(name=="Chikkodi College")
{
    return chikkodiCourse;
}

if(name=="Athani College")
{
    return athaniCollegeCourse;
}

if(name=="Saundatti Institute")
{
    return saundattiInstCourse;
}

if(name=="Hukkeri College")
{
    return hukkeriCourse;
}

if(name=="Sankeshwar College")
{
    return sankeshwarCourse;
}



return null;
	 }
	 
 }
 
 