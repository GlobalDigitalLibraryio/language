
/*
 * Part of GDL language.
 * Copyright (C) 2018 Global Digital Library
 *
 * See LICENSE
 */

package io.digitallibrary.language.model

object CodeLists {

  sealed abstract class Iso639 {
    def id: String
    def part2b: Option[String]
    def part2t: Option[String]
    def part1: Option[String]
    def scope: Option[String]
    def languageType: Option[String]
    def refName: String
    def localName: Option[String]
    def comment: Option[String]
  }

  sealed abstract class Iso15924 {
    def code: String
    def no: Int
    def englishName: String
    def frenchName: String
    def pva: Option[String]
    def date: String
  }

  sealed abstract class Iso3166 {
    def code: String
    def name: String
  }

  case class Iso639Val(id: String, part2b: Option[String], part2t: Option[String], part1: Option[String], scope: Option[String], languageType: Option[String], refName: String, localName: Option[String], comment: Option[String]) extends Iso639
  case class Iso15924Val(code: String, no: Int, englishName: String, frenchName: String, pva: Option[String], date: String) extends Iso15924
  case class Iso3166Val(code: String, name: String) extends Iso3166

  val iso15924Definitions = Seq(
    Iso15924Val("Adlm", 166, "Adlam", "adlam", Some("Adlam"), "2016-12-05"),
    Iso15924Val("Afak", 439, "Afaka", "afaka", None, "2010-12-21"),
    Iso15924Val("Aghb", 239, "Caucasian Albanian", "aghbanien", Some("Caucasian_Albanian"), "2014-11-15"),
    Iso15924Val("Ahom", 338, "Ahom, Tai Ahom", "âhom", Some("Ahom"), "2015-07-07"),
    Iso15924Val("Arab", 160, "Arabic", "arabe", Some("Arabic"), "2004-05-01"),
    Iso15924Val("Aran", 161, "Arabic (Nastaliq variant)", "arabe (variante nastalique)", None, "2014-11-15"),
    Iso15924Val("Armi", 124, "Imperial Aramaic", "araméen impérial", Some("Imperial_Aramaic"), "2009-06-01"),
    Iso15924Val("Armn", 230, "Armenian", "arménien", Some("Armenian"), "2004-05-01"),
    Iso15924Val("Avst", 134, "Avestan", "avestique", Some("Avestan"), "2009-06-01"),
    Iso15924Val("Bali", 360, "Balinese", "balinais", Some("Balinese"), "2006-10-10"),
    Iso15924Val("Bamu", 435, "Bamum", "bamoum", Some("Bamum"), "2009-06-01"),
    Iso15924Val("Bass", 259, "Bassa Vah", "bassa", Some("Bassa_Vah"), "2014-11-15"),
    Iso15924Val("Batk", 365, "Batak", "batik", Some("Batak"), "2010-07-23"),
    Iso15924Val("Beng", 325, "Bengali (Bangla)", "bengalî (bangla)", Some("Bengali"), "2016-12-05"),
    Iso15924Val("Bhks", 334, "Bhaiksuki", "bhaïksukî", Some("Bhaiksuki"), "2016-12-05"),
    Iso15924Val("Blis", 550, "Blissymbols", "symboles Bliss", None, "2004-05-01"),
    Iso15924Val("Bopo", 285, "Bopomofo", "bopomofo", Some("Bopomofo"), "2004-05-01"),
    Iso15924Val("Brah", 300, "Brahmi", "brahma", Some("Brahmi"), "2010-07-23"),
    Iso15924Val("Brai", 570, "Braille", "braille", Some("Braille"), "2004-05-01"),
    Iso15924Val("Bugi", 367, "Buginese", "bouguis", Some("Buginese"), "2006-06-21"),
    Iso15924Val("Buhd", 372, "Buhid", "bouhide", Some("Buhid"), "2004-05-01"),
    Iso15924Val("Cakm", 349, "Chakma", "chakma", Some("Chakma"), "2012-02-06"),
    Iso15924Val("Cans", 440, "Unified Canadian Aboriginal Syllabics", "syllabaire autochtone canadien unifié", Some("Canadian_Aboriginal"), "2004-05-29"),
    Iso15924Val("Cari", 201, "Carian", "carien", Some("Carian"), "2007-07-02"),
    Iso15924Val("Cham", 358, "Cham", "cham (čam, tcham)", Some("Cham"), "2009-11-11"),
    Iso15924Val("Cher", 445, "Cherokee", "tchérokî", Some("Cherokee"), "2004-05-01"),
    Iso15924Val("Cirt", 291, "Cirth", "cirth", None, "2004-05-01"),
    Iso15924Val("Copt", 204, "Coptic", "copte", Some("Coptic"), "2006-06-21"),
    Iso15924Val("Cpmn", 402, "Cypro-Minoan", "syllabaire chypro-minoen", None, "2017-07-26"),
    Iso15924Val("Cprt", 403, "Cypriot syllabary", "syllabaire chypriote", Some("Cypriot"), "2017-07-26"),
    Iso15924Val("Cyrl", 220, "Cyrillic", "cyrillique", Some("Cyrillic"), "2004-05-01"),
    Iso15924Val("Cyrs", 221, "Cyrillic (Old Church Slavonic variant)", "cyrillique (variante slavonne)", None, "2004-05-01"),
    Iso15924Val("Deva", 315, "Devanagari (Nagari)", "dévanâgarî", Some("Devanagari"), "2004-05-01"),
    Iso15924Val("Dogr", 328, "Dogra", "dogra", None, "2016-12-05"),
    Iso15924Val("Dsrt", 250, "Deseret (Mormon)", "déseret (mormon)", Some("Deseret"), "2004-05-01"),
    Iso15924Val("Dupl", 755, "Duployan shorthand, Duployan stenography", "sténographie Duployé", Some("Duployan"), "2014-11-15"),
    Iso15924Val("Egyd", 70, "Egyptian demotic", "démotique égyptien", None, "2004-05-01"),
    Iso15924Val("Egyh", 60, "Egyptian hieratic", "hiératique égyptien", None, "2004-05-01"),
    Iso15924Val("Egyp", 50, "Egyptian hieroglyphs", "hiéroglyphes égyptiens", Some("Egyptian_Hieroglyphs"), "2009-06-01"),
    Iso15924Val("Elba", 226, "Elbasan", "elbasan", Some("Elbasan"), "2014-11-15"),
    Iso15924Val("Ethi", 430, "Ethiopic (Geʻez)", "éthiopien (geʻez, guèze)", Some("Ethiopic"), "2004-10-25"),
    Iso15924Val("Geok", 241, "Khutsuri (Asomtavruli and Nuskhuri)", "khoutsouri (assomtavrouli et nouskhouri)", Some("Georgian"), "2012-10-16"),
    Iso15924Val("Geor", 240, "Georgian (Mkhedruli and Mtavruli)", "géorgien (mkhédrouli et mtavrouli)", Some("Georgian"), "2016-12-05"),
    Iso15924Val("Glag", 225, "Glagolitic", "glagolitique", Some("Glagolitic"), "2006-06-21"),
    Iso15924Val("Gong", 312, "Gunjala Gondi", "gunjala gondî", None, "2016-12-05"),
    Iso15924Val("Gonm", 313, "Masaram Gondi", "masaram gondî", Some("Masaram Gondi"), "2017-07-26"),
    Iso15924Val("Goth", 206, "Gothic", "gotique", Some("Gothic"), "2004-05-01"),
    Iso15924Val("Gran", 343, "Grantha", "grantha", Some("Grantha"), "2014-11-15"),
    Iso15924Val("Grek", 200, "Greek", "grec", Some("Greek"), "2004-05-01"),
    Iso15924Val("Gujr", 320, "Gujarati", "goudjarâtî (gujrâtî)", Some("Gujarati"), "2004-05-01"),
    Iso15924Val("Guru", 310, "Gurmukhi", "gourmoukhî", Some("Gurmukhi"), "2004-05-01"),
    Iso15924Val("Hanb", 503, "Han with Bopomofo (alias for Han + Bopomofo)", "han avec bopomofo (alias pour han + bopomofo)", None, "2016-01-19"),
    Iso15924Val("Hang", 286, "Hangul (Hangŭl, Hangeul)", "hangûl (hangŭl, hangeul)", Some("Hangul"), "2004-05-29"),
    Iso15924Val("Hani", 500, "Han (Hanzi, Kanji, Hanja)", "idéogrammes han (sinogrammes)", Some("Han"), "2009-02-23"),
    Iso15924Val("Hano", 371, "Hanunoo (Hanunóo)", "hanounóo", Some("Hanunoo"), "2004-05-29"),
    Iso15924Val("Hans", 501, "Han (Simplified variant)", "idéogrammes han (variante simplifiée)", None, "2004-05-29"),
    Iso15924Val("Hant", 502, "Han (Traditional variant)", "idéogrammes han (variante traditionnelle)", None, "2004-05-29"),
    Iso15924Val("Hatr", 127, "Hatran", "hatrénien", Some("Hatran"), "2015-07-07"),
    Iso15924Val("Hebr", 125, "Hebrew", "hébreu", Some("Hebrew"), "2004-05-01"),
    Iso15924Val("Hira", 410, "Hiragana", "hiragana", Some("Hiragana"), "2004-05-01"),
    Iso15924Val("Hluw", 80, "Anatolian Hieroglyphs (Luwian Hieroglyphs, Hittite Hieroglyphs)", "hiéroglyphes anatoliens (hiéroglyphes louvites, hiéroglyphes hittites)", Some("Anatolian_Hieroglyphs"), "2015-07-07"),
    Iso15924Val("Hmng", 450, "Pahawh Hmong", "pahawh hmong", Some("Pahawh_Hmong"), "2014-11-15"),
    Iso15924Val("Hmnp", 451, "Nyiakeng Puachue Hmong", "nyiakeng puachue hmong", None, "2017-07-26"),
    Iso15924Val("Hrkt", 412, "Japanese syllabaries (alias for Hiragana + Katakana)", "syllabaires japonais (alias pour hiragana + katakana)", Some("Katakana_Or_Hiragana"), "2011-06-21"),
    Iso15924Val("Hung", 176, "Old Hungarian (Hungarian Runic)", "runes hongroises (ancien hongrois)", Some("Old_Hungarian"), "2015-07-07"),
    Iso15924Val("Inds", 610, "Indus (Harappan)", "indus", None, "2004-05-01"),
    Iso15924Val("Ital", 210, "Old Italic (Etruscan, Oscan, etc.)", "ancien italique (étrusque, osque, etc.)", Some("Old_Italic"), "2004-05-29"),
    Iso15924Val("Jamo", 284, "Jamo (alias for Jamo subset of Hangul)", "jamo (alias pour le sous-ensemble jamo du hangûl)", None, "2016-01-19"),
    Iso15924Val("Java", 361, "Javanese", "javanais", Some("Javanese"), "2009-06-01"),
    Iso15924Val("Jpan", 413, "Japanese (alias for Han + Hiragana + Katakana)", "japonais (alias pour han + hiragana + katakana)", None, "2006-06-21"),
    Iso15924Val("Jurc", 510, "Jurchen", "jurchen", None, "2010-12-21"),
    Iso15924Val("Kali", 357, "Kayah Li", "kayah li", Some("Kayah_Li"), "2007-07-02"),
    Iso15924Val("Kana", 411, "Katakana", "katakana", Some("Katakana"), "2004-05-01"),
    Iso15924Val("Khar", 305, "Kharoshthi", "kharochthî", Some("Kharoshthi"), "2006-06-21"),
    Iso15924Val("Khmr", 355, "Khmer", "khmer", Some("Khmer"), "2004-05-29"),
    Iso15924Val("Khoj", 322, "Khojki", "khojkî", Some("Khojki"), "2014-11-15"),
    Iso15924Val("Kitl", 505, "Khitan large script", "grande écriture khitan", None, "2015-07-15"),
    Iso15924Val("Kits", 288, "Khitan small script", "petite écriture khitan", None, "2015-07-15"),
    Iso15924Val("Knda", 345, "Kannada", "kannara (canara)", Some("Kannada"), "2004-05-29"),
    Iso15924Val("Kore", 287, "Korean (alias for Hangul + Han)", "coréen (alias pour hangûl + han)", None, "2007-06-13"),
    Iso15924Val("Kpel", 436, "Kpelle", "kpèllé", None, "2010-03-26"),
    Iso15924Val("Kthi", 317, "Kaithi", "kaithî", Some("Kaithi"), "2009-06-01"),
    Iso15924Val("Lana", 351, "Tai Tham (Lanna)", "taï tham (lanna)", Some("Tai_Tham"), "2009-06-01"),
    Iso15924Val("Laoo", 356, "Lao", "laotien", Some("Lao"), "2004-05-01"),
    Iso15924Val("Latf", 217, "Latin (Fraktur variant)", "latin (variante brisée)", None, "2004-05-01"),
    Iso15924Val("Latg", 216, "Latin (Gaelic variant)", "latin (variante gaélique)", None, "2004-05-01"),
    Iso15924Val("Latn", 215, "Latin", "latin", Some("Latin"), "2004-05-01"),
    Iso15924Val("Leke", 364, "Leke", "léké", None, "2015-07-07"),
    Iso15924Val("Lepc", 335, "Lepcha (Róng)", "lepcha (róng)", Some("Lepcha"), "2007-07-02"),
    Iso15924Val("Limb", 336, "Limbu", "limbou", Some("Limbu"), "2004-05-29"),
    Iso15924Val("Lina", 400, "Linear A", "linéaire A", Some("Linear_A"), "2014-11-15"),
    Iso15924Val("Linb", 401, "Linear B", "linéaire B", Some("Linear_B"), "2004-05-29"),
    Iso15924Val("Lisu", 399, "Lisu (Fraser)", "lisu (Fraser)", Some("Lisu"), "2009-06-01"),
    Iso15924Val("Loma", 437, "Loma", "loma", None, "2010-03-26"),
    Iso15924Val("Lyci", 202, "Lycian", "lycien", Some("Lycian"), "2007-07-02"),
    Iso15924Val("Lydi", 116, "Lydian", "lydien", Some("Lydian"), "2007-07-02"),
    Iso15924Val("Mahj", 314, "Mahajani", "mahâjanî", Some("Mahajani"), "2014-11-15"),
    Iso15924Val("Maka", 366, "Makasar", "makassar", None, "2016-12-05"),
    Iso15924Val("Mand", 140, "Mandaic, Mandaean", "mandéen", Some("Mandaic"), "2010-07-23"),
    Iso15924Val("Mani", 139, "Manichaean", "manichéen", Some("Manichaean"), "2014-11-15"),
    Iso15924Val("Marc", 332, "Marchen", "marchen", Some("Marchen"), "2016-12-05"),
    Iso15924Val("Maya", 90, "Mayan hieroglyphs", "hiéroglyphes mayas", None, "2004-05-01"),
    Iso15924Val("Medf", 265, "Medefaidrin (Oberi Okaime, Oberi Ɔkaimɛ)", "médéfaïdrine", None, "2016-12-05"),
    Iso15924Val("Mend", 438, "Mende Kikakui", "mendé kikakui", Some("Mende_Kikakui"), "2014-11-15"),
    Iso15924Val("Merc", 101, "Meroitic Cursive", "cursif méroïtique", Some("Meroitic_Cursive"), "2012-02-06"),
    Iso15924Val("Mero", 100, "Meroitic Hieroglyphs", "hiéroglyphes méroïtiques", Some("Meroitic_Hieroglyphs"), "2012-02-06"),
    Iso15924Val("Mlym", 347, "Malayalam", "malayâlam", Some("Malayalam"), "2004-05-01"),
    Iso15924Val("Modi", 324, "Modi, Moḍī", "modî", Some("Modi"), "2014-11-15"),
    Iso15924Val("Mong", 145, "Mongolian", "mongol", Some("Mongolian"), "2004-05-01"),
    Iso15924Val("Moon", 218, "Moon (Moon code, Moon script, Moon type)", "écriture Moon", None, "2006-12-11"),
    Iso15924Val("Mroo", 264, "Mro, Mru", "mro", Some("Mro"), "2016-12-05"),
    Iso15924Val("Mtei", 337, "Meitei Mayek (Meithei, Meetei)", "meitei mayek", Some("Meetei_Mayek"), "2009-06-01"),
    Iso15924Val("Mult", 323, "Multani", "multanî", Some("Multani"), "2015-07-07"),
    Iso15924Val("Mymr", 350, "Myanmar (Burmese)", "birman", Some("Myanmar"), "2004-05-01"),
    Iso15924Val("Narb", 106, "Old North Arabian (Ancient North Arabian)", "nord-arabique", Some("Old_North_Arabian"), "2014-11-15"),
    Iso15924Val("Nbat", 159, "Nabataean", "nabatéen", Some("Nabataean"), "2014-11-15"),
    Iso15924Val("Newa", 333, "Newa, Newar, Newari, Nepāla lipi", "néwa, néwar, néwari, nepāla lipi", Some("Newa"), "2016-12-05"),
    Iso15924Val("Nkdb", 85, "Naxi Dongba (na²¹ɕi³³ to³³ba²¹, Nakhi Tomba)", "naxi dongba", None, "2017-07-26"),
    Iso15924Val("Nkgb", 420, "Naxi Geba (na²¹ɕi³³ gʌ²¹ba²¹, 'Na-'Khi ²Ggŏ-¹baw, Nakhi Geba)", "naxi geba, nakhi geba", None, "2017-07-26"),
    Iso15924Val("Nkoo", 165, "N’Ko", "n’ko", Some("Nko"), "2006-10-10"),
    Iso15924Val("Nshu", 499, "Nüshu", "nüshu", Some("Nushu"), "2017-07-26"),
    Iso15924Val("Ogam", 212, "Ogham", "ogam", Some("Ogham"), "2004-05-01"),
    Iso15924Val("Olck", 261, "Ol Chiki (Ol Cemet’, Ol, Santali)", "ol tchiki", Some("Ol_Chiki"), "2007-07-02"),
    Iso15924Val("Orkh", 175, "Old Turkic, Orkhon Runic", "orkhon", Some("Old_Turkic"), "2009-06-01"),
    Iso15924Val("Orya", 327, "Oriya (Odia)", "oriyâ (odia)", Some("Oriya"), "2016-12-05"),
    Iso15924Val("Osge", 219, "Osage", "osage", Some("Osage"), "2016-12-05"),
    Iso15924Val("Osma", 260, "Osmanya", "osmanais", Some("Osmanya"), "2004-05-01"),
    Iso15924Val("Palm", 126, "Palmyrene", "palmyrénien", Some("Palmyrene"), "2014-11-15"),
    Iso15924Val("Pauc", 263, "Pau Cin Hau", "paou chin haou", Some("Pau_Cin_Hau"), "2014-11-15"),
    Iso15924Val("Perm", 227, "Old Permic", "ancien permien", Some("Old_Permic"), "2014-11-15"),
    Iso15924Val("Phag", 331, "Phags-pa", "’phags pa", Some("Phags_Pa"), "2006-10-10"),
    Iso15924Val("Phli", 131, "Inscriptional Pahlavi", "pehlevi des inscriptions", Some("Inscriptional_Pahlavi"), "2009-06-01"),
    Iso15924Val("Phlp", 132, "Psalter Pahlavi", "pehlevi des psautiers", Some("Psalter_Pahlavi"), "2014-11-15"),
    Iso15924Val("Phlv", 133, "Book Pahlavi", "pehlevi des livres", None, "2007-07-15"),
    Iso15924Val("Phnx", 115, "Phoenician", "phénicien", Some("Phoenician"), "2006-10-10"),
    Iso15924Val("Plrd", 282, "Miao (Pollard)", "miao (Pollard)", Some("Miao"), "2012-02-06"),
    Iso15924Val("Piqd", 293, "Klingon (KLI pIqaD)", "klingon (pIqaD du KLI)", None, "2015-12-16"),
    Iso15924Val("Prti", 130, "Inscriptional Parthian", "parthe des inscriptions", Some("Inscriptional_Parthian"), "2009-06-01"),
    Iso15924Val("Qaaa", 900, "Reserved for private use (start)", "réservé à l’usage privé (début)", None, "2004-05-29"),
    Iso15924Val("Qabx", 949, "Reserved for private use (end)", "réservé à l’usage privé (fin)", None, "2004-05-29"),
    Iso15924Val("Rjng", 363, "Rejang (Redjang, Kaganga)", "redjang (kaganga)", Some("Rejang"), "2009-02-23"),
    Iso15924Val("Roro", 620, "Rongorongo", "rongorongo", None, "2004-05-01"),
    Iso15924Val("Runr", 211, "Runic", "runique", Some("Runic"), "2004-05-01"),
    Iso15924Val("Samr", 123, "Samaritan", "samaritain", Some("Samaritan"), "2009-06-01"),
    Iso15924Val("Sara", 292, "Sarati", "sarati", None, "2004-05-29"),
    Iso15924Val("Sarb", 105, "Old South Arabian", "sud-arabique, himyarite", Some("Old_South_Arabian"), "2009-06-01"),
    Iso15924Val("Saur", 344, "Saurashtra", "saurachtra", Some("Saurashtra"), "2007-07-02"),
    Iso15924Val("Sgnw", 95, "SignWriting", "SignÉcriture, SignWriting", Some("SignWriting"), "2015-07-07"),
    Iso15924Val("Shaw", 281, "Shavian (Shaw)", "shavien (Shaw)", Some("Shavian"), "2004-05-01"),
    Iso15924Val("Shrd", 319, "Sharada, Śāradā", "charada, shard", Some("Sharada"), "2012-02-06"),
    Iso15924Val("Shui", 530, "Shuishu", "shuishu", None, "2017-07-26"),
    Iso15924Val("Sidd", 302, "Siddham, Siddhaṃ, Siddhamātṛkā", "siddham", Some("Siddham"), "2014-11-15"),
    Iso15924Val("Sind", 318, "Khudawadi, Sindhi", "khoudawadî, sindhî", Some("Khudawadi"), "2014-11-15"),
    Iso15924Val("Sinh", 348, "Sinhala", "singhalais", Some("Sinhala"), "2004-05-01"),
    Iso15924Val("Sora", 398, "Sora Sompeng", "sora sompeng", Some("Sora_Sompeng"), "2012-02-06"),
    Iso15924Val("Soyo", 329, "Soyombo", "soyombo", Some("Soyombo"), "2017-07-26"),
    Iso15924Val("Sund", 362, "Sundanese", "sundanais", Some("Sundanese"), "2007-07-02"),
    Iso15924Val("Sylo", 316, "Syloti Nagri", "sylotî nâgrî", Some("Syloti_Nagri"), "2006-06-21"),
    Iso15924Val("Syrc", 135, "Syriac", "syriaque", Some("Syriac"), "2004-05-01"),
    Iso15924Val("Syre", 138, "Syriac (Estrangelo variant)", "syriaque (variante estranghélo)", None, "2004-05-01"),
    Iso15924Val("Syrj", 137, "Syriac (Western variant)", "syriaque (variante occidentale)", None, "2004-05-01"),
    Iso15924Val("Syrn", 136, "Syriac (Eastern variant)", "syriaque (variante orientale)", None, "2004-05-01"),
    Iso15924Val("Tagb", 373, "Tagbanwa", "tagbanoua", Some("Tagbanwa"), "2004-05-01"),
    Iso15924Val("Takr", 321, "Takri, Ṭākrī, Ṭāṅkrī", "tâkrî", Some("Takri"), "2012-02-06"),
    Iso15924Val("Tale", 353, "Tai Le", "taï-le", Some("Tai_Le"), "2004-10-25"),
    Iso15924Val("Talu", 354, "New Tai Lue", "nouveau taï-lue", Some("New_Tai_Lue"), "2006-06-21"),
    Iso15924Val("Taml", 346, "Tamil", "tamoul", Some("Tamil"), "2004-05-01"),
    Iso15924Val("Tang", 520, "Tangut", "tangoute", Some("Tangut"), "2016-12-05"),
    Iso15924Val("Tavt", 359, "Tai Viet", "taï viêt", Some("Tai_Viet"), "2009-06-01"),
    Iso15924Val("Telu", 340, "Telugu", "télougou", Some("Telugu"), "2004-05-01"),
    Iso15924Val("Teng", 290, "Tengwar", "tengwar", None, "2004-05-01"),
    Iso15924Val("Tfng", 120, "Tifinagh (Berber)", "tifinagh (berbère)", Some("Tifinagh"), "2006-06-21"),
    Iso15924Val("Tglg", 370, "Tagalog (Baybayin, Alibata)", "tagal (baybayin, alibata)", Some("Tagalog"), "2009-02-23"),
    Iso15924Val("Thaa", 170, "Thaana", "thâna", Some("Thaana"), "2004-05-01"),
    Iso15924Val("Thai", 352, "Thai", "thaï", Some("Thai"), "2004-05-01"),
    Iso15924Val("Tibt", 330, "Tibetan", "tibétain", Some("Tibetan"), "2004-05-01"),
    Iso15924Val("Tirh", 326, "Tirhuta", "tirhouta", Some("Tirhuta"), "2014-11-15"),
    Iso15924Val("Ugar", 40, "Ugaritic", "ougaritique", Some("Ugaritic"), "2004-05-01"),
    Iso15924Val("Vaii", 470, "Vai", "vaï", Some("Vai"), "2007-07-02"),
    Iso15924Val("Visp", 280, "Visible Speech", "parole visible", None, "2004-05-01"),
    Iso15924Val("Wara", 262, "Warang Citi (Varang Kshiti)", "warang citi", Some("Warang_Citi"), "2014-11-15"),
    Iso15924Val("Wcho", 283, "Wancho", "wantcho", None, "2017-07-26"),
    Iso15924Val("Wole", 480, "Woleai", "woléaï", None, "2010-12-21"),
    Iso15924Val("Xpeo", 30, "Old Persian", "cunéiforme persépolitain", Some("Old_Persian"), "2006-06-21"),
    Iso15924Val("Xsux", 20, "Cuneiform, Sumero-Akkadian", "cunéiforme suméro-akkadien", Some("Cuneiform"), "2006-10-10"),
    Iso15924Val("Yiii", 460, "Yi", "yi", Some("Yi"), "2004-05-01"),
    Iso15924Val("Zanb", 339, "Zanabazar Square (Zanabazarin Dörböljin Useg, Xewtee Dörböljin Bicig, Horizontal Square Script)", "zanabazar quadratique", Some("Zanabazar_Square"), "2017-07-26"),
    Iso15924Val("Zinh", 994, "Code for inherited script", "codet pour écriture héritée", Some("Inherited"), "2009-02-23"),
    Iso15924Val("Zmth", 995, "Mathematical notation", "notation mathématique", None, "2007-11-26"),
    Iso15924Val("Zsye", 993, "Symbols (Emoji variant)", "symboles (variante émoji)", None, "2015-12-16"),
    Iso15924Val("Zsym", 996, "Symbols", "symboles", None, "2007-11-26"),
    Iso15924Val("Zxxx", 997, "Code for unwritten documents", "codet pour les documents non écrits", None, "2011-06-21"),
    Iso15924Val("Zyyy", 998, "Code for undetermined script", "codet pour écriture indéterminée", Some("Common"), "2004-05-29"),
    Iso15924Val("Zzzz", 999, "Code for uncoded script", "codet pour écriture non codée", Some("Unknown"), "2006-10-10")
  )

  val iso3166Definitions = Seq(
    Iso3166Val("AF", "Afghanistan"),
    Iso3166Val("AX", "Åland Islands"),
    Iso3166Val("AL", "Albania"),
    Iso3166Val("DZ", "Algeria"),
    Iso3166Val("AS", "American Samoa"),
    Iso3166Val("AD", "Andorra"),
    Iso3166Val("AO", "Angola"),
    Iso3166Val("AI", "Anguilla"),
    Iso3166Val("AQ", "Antarctica"),
    Iso3166Val("AG", "Antigua and Barbuda"),
    Iso3166Val("AR", "Argentina"),
    Iso3166Val("AM", "Armenia"),
    Iso3166Val("AW", "Aruba"),
    Iso3166Val("AU", "Australia"),
    Iso3166Val("AT", "Austria"),
    Iso3166Val("AZ", "Azerbaijan"),
    Iso3166Val("BS", "Bahamas"),
    Iso3166Val("BH", "Bahrain"),
    Iso3166Val("BD", "Bangladesh"),
    Iso3166Val("BB", "Barbados"),
    Iso3166Val("BY", "Belarus"),
    Iso3166Val("BE", "Belgium"),
    Iso3166Val("BZ", "Belize"),
    Iso3166Val("BJ", "Benin"),
    Iso3166Val("BM", "Bermuda"),
    Iso3166Val("BT", "Bhutan"),
    Iso3166Val("BO", "Bolivia, Plurinational State of"),
    Iso3166Val("BQ", "Bonaire, Sint Eustatius and Saba"),
    Iso3166Val("BA", "Bosnia and Herzegovina"),
    Iso3166Val("BW", "Botswana"),
    Iso3166Val("BV", "Bouvet Island"),
    Iso3166Val("BR", "Brazil"),
    Iso3166Val("IO", "British Indian Ocean Territory"),
    Iso3166Val("BN", "Brunei Darussalam"),
    Iso3166Val("BG", "Bulgaria"),
    Iso3166Val("BF", "Burkina Faso"),
    Iso3166Val("BI", "Burundi"),
    Iso3166Val("KH", "Cambodia"),
    Iso3166Val("CM", "Cameroon"),
    Iso3166Val("CA", "Canada"),
    Iso3166Val("CV", "Cape Verde"),
    Iso3166Val("KY", "Cayman Islands"),
    Iso3166Val("CF", "Central African Republic"),
    Iso3166Val("TD", "Chad"),
    Iso3166Val("CL", "Chile"),
    Iso3166Val("CN", "China"),
    Iso3166Val("CX", "Christmas Island"),
    Iso3166Val("CC", "Cocos (Keeling) Islands"),
    Iso3166Val("CO", "Colombia"),
    Iso3166Val("KM", "Comoros"),
    Iso3166Val("CG", "Congo"),
    Iso3166Val("CD", "Congo, the Democratic Republic of the"),
    Iso3166Val("CK", "Cook Islands"),
    Iso3166Val("CR", "Costa Rica"),
    Iso3166Val("CI", "Côte d'Ivoire"),
    Iso3166Val("HR", "Croatia"),
    Iso3166Val("CU", "Cuba"),
    Iso3166Val("CW", "Curaçao"),
    Iso3166Val("CY", "Cyprus"),
    Iso3166Val("CZ", "Czech Republic"),
    Iso3166Val("DK", "Denmark"),
    Iso3166Val("DJ", "Djibouti"),
    Iso3166Val("DM", "Dominica"),
    Iso3166Val("DO", "Dominican Republic"),
    Iso3166Val("EC", "Ecuador"),
    Iso3166Val("EG", "Egypt"),
    Iso3166Val("SV", "El Salvador"),
    Iso3166Val("GQ", "Equatorial Guinea"),
    Iso3166Val("ER", "Eritrea"),
    Iso3166Val("EE", "Estonia"),
    Iso3166Val("ET", "Ethiopia"),
    Iso3166Val("FK", "Falkland Islands (Malvinas)"),
    Iso3166Val("FO", "Faroe Islands"),
    Iso3166Val("FJ", "Fiji"),
    Iso3166Val("FI", "Finland"),
    Iso3166Val("FR", "France"),
    Iso3166Val("GF", "French Guiana"),
    Iso3166Val("PF", "French Polynesia"),
    Iso3166Val("TF", "French Southern Territories"),
    Iso3166Val("GA", "Gabon"),
    Iso3166Val("GM", "Gambia"),
    Iso3166Val("GE", "Georgia"),
    Iso3166Val("DE", "Germany"),
    Iso3166Val("GH", "Ghana"),
    Iso3166Val("GI", "Gibraltar"),
    Iso3166Val("GR", "Greece"),
    Iso3166Val("GL", "Greenland"),
    Iso3166Val("GD", "Grenada"),
    Iso3166Val("GP", "Guadeloupe"),
    Iso3166Val("GU", "Guam"),
    Iso3166Val("GT", "Guatemala"),
    Iso3166Val("GG", "Guernsey"),
    Iso3166Val("GN", "Guinea"),
    Iso3166Val("GW", "Guinea-Bissau"),
    Iso3166Val("GY", "Guyana"),
    Iso3166Val("HT", "Haiti"),
    Iso3166Val("HM", "Heard Island and McDonald Islands"),
    Iso3166Val("VA", "Holy See (Vatican City State)"),
    Iso3166Val("HN", "Honduras"),
    Iso3166Val("HK", "Hong Kong"),
    Iso3166Val("HU", "Hungary"),
    Iso3166Val("IS", "Iceland"),
    Iso3166Val("IN", "India"),
    Iso3166Val("ID", "Indonesia"),
    Iso3166Val("IR", "Iran, Islamic Republic of"),
    Iso3166Val("IQ", "Iraq"),
    Iso3166Val("IE", "Ireland"),
    Iso3166Val("IM", "Isle of Man"),
    Iso3166Val("IL", "Israel"),
    Iso3166Val("IT", "Italy"),
    Iso3166Val("JM", "Jamaica"),
    Iso3166Val("JP", "Japan"),
    Iso3166Val("JE", "Jersey"),
    Iso3166Val("JO", "Jordan"),
    Iso3166Val("KZ", "Kazakhstan"),
    Iso3166Val("KE", "Kenya"),
    Iso3166Val("KI", "Kiribati"),
    Iso3166Val("KP", "Korea, Democratic People's Republic of"),
    Iso3166Val("KR", "Korea, Republic of"),
    Iso3166Val("KW", "Kuwait"),
    Iso3166Val("KG", "Kyrgyzstan"),
    Iso3166Val("LA", "Lao People's Democratic Republic"),
    Iso3166Val("LV", "Latvia"),
    Iso3166Val("LB", "Lebanon"),
    Iso3166Val("LS", "Lesotho"),
    Iso3166Val("LR", "Liberia"),
    Iso3166Val("LY", "Libya"),
    Iso3166Val("LI", "Liechtenstein"),
    Iso3166Val("LT", "Lithuania"),
    Iso3166Val("LU", "Luxembourg"),
    Iso3166Val("MO", "Macao"),
    Iso3166Val("MK", "Macedonia, the Former Yugoslav Republic of"),
    Iso3166Val("MG", "Madagascar"),
    Iso3166Val("MW", "Malawi"),
    Iso3166Val("MY", "Malaysia"),
    Iso3166Val("MV", "Maldives"),
    Iso3166Val("ML", "Mali"),
    Iso3166Val("MT", "Malta"),
    Iso3166Val("MH", "Marshall Islands"),
    Iso3166Val("MQ", "Martinique"),
    Iso3166Val("MR", "Mauritania"),
    Iso3166Val("MU", "Mauritius"),
    Iso3166Val("YT", "Mayotte"),
    Iso3166Val("MX", "Mexico"),
    Iso3166Val("FM", "Micronesia, Federated States of"),
    Iso3166Val("MD", "Moldova, Republic of"),
    Iso3166Val("MC", "Monaco"),
    Iso3166Val("MN", "Mongolia"),
    Iso3166Val("ME", "Montenegro"),
    Iso3166Val("MS", "Montserrat"),
    Iso3166Val("MA", "Morocco"),
    Iso3166Val("MZ", "Mozambique"),
    Iso3166Val("MM", "Myanmar"),
    Iso3166Val("NA", "Namibia"),
    Iso3166Val("NR", "Nauru"),
    Iso3166Val("NP", "Nepal"),
    Iso3166Val("NL", "Netherlands"),
    Iso3166Val("NC", "New Caledonia"),
    Iso3166Val("NZ", "New Zealand"),
    Iso3166Val("NI", "Nicaragua"),
    Iso3166Val("NE", "Niger"),
    Iso3166Val("NG", "Nigeria"),
    Iso3166Val("NU", "Niue"),
    Iso3166Val("NF", "Norfolk Island"),
    Iso3166Val("MP", "Northern Mariana Islands"),
    Iso3166Val("NO", "Norway"),
    Iso3166Val("OM", "Oman"),
    Iso3166Val("PK", "Pakistan"),
    Iso3166Val("PW", "Palau"),
    Iso3166Val("PS", "Palestine, State of"),
    Iso3166Val("PA", "Panama"),
    Iso3166Val("PG", "Papua New Guinea"),
    Iso3166Val("PY", "Paraguay"),
    Iso3166Val("PE", "Peru"),
    Iso3166Val("PH", "Philippines"),
    Iso3166Val("PN", "Pitcairn"),
    Iso3166Val("PL", "Poland"),
    Iso3166Val("PT", "Portugal"),
    Iso3166Val("PR", "Puerto Rico"),
    Iso3166Val("QA", "Qatar"),
    Iso3166Val("RE", "Réunion"),
    Iso3166Val("RO", "Romania"),
    Iso3166Val("RU", "Russian Federation"),
    Iso3166Val("RW", "Rwanda"),
    Iso3166Val("BL", "Saint Barthélemy"),
    Iso3166Val("SH", "Saint Helena, Ascension and Tristan da Cunha"),
    Iso3166Val("KN", "Saint Kitts and Nevis"),
    Iso3166Val("LC", "Saint Lucia"),
    Iso3166Val("MF", "Saint Martin (French part)"),
    Iso3166Val("PM", "Saint Pierre and Miquelon"),
    Iso3166Val("VC", "Saint Vincent and the Grenadines"),
    Iso3166Val("WS", "Samoa"),
    Iso3166Val("SM", "San Marino"),
    Iso3166Val("ST", "Sao Tome and Principe"),
    Iso3166Val("SA", "Saudi Arabia"),
    Iso3166Val("SN", "Senegal"),
    Iso3166Val("RS", "Serbia"),
    Iso3166Val("SC", "Seychelles"),
    Iso3166Val("SL", "Sierra Leone"),
    Iso3166Val("SG", "Singapore"),
    Iso3166Val("SX", "Sint Maarten (Dutch part)"),
    Iso3166Val("SK", "Slovakia"),
    Iso3166Val("SI", "Slovenia"),
    Iso3166Val("SB", "Solomon Islands"),
    Iso3166Val("SO", "Somalia"),
    Iso3166Val("ZA", "South Africa"),
    Iso3166Val("GS", "South Georgia and the South Sandwich Islands"),
    Iso3166Val("SS", "South Sudan"),
    Iso3166Val("ES", "Spain"),
    Iso3166Val("LK", "Sri Lanka"),
    Iso3166Val("SD", "Sudan"),
    Iso3166Val("SR", "Suriname"),
    Iso3166Val("SJ", "Svalbard and Jan Mayen"),
    Iso3166Val("SZ", "Swaziland"),
    Iso3166Val("SE", "Sweden"),
    Iso3166Val("CH", "Switzerland"),
    Iso3166Val("SY", "Syrian Arab Republic"),
    Iso3166Val("TW", "Taiwan, Province of China"),
    Iso3166Val("TJ", "Tajikistan"),
    Iso3166Val("TZ", "Tanzania, United Republic of"),
    Iso3166Val("TH", "Thailand"),
    Iso3166Val("TL", "Timor-Leste"),
    Iso3166Val("TG", "Togo"),
    Iso3166Val("TK", "Tokelau"),
    Iso3166Val("TO", "Tonga"),
    Iso3166Val("TT", "Trinidad and Tobago"),
    Iso3166Val("TN", "Tunisia"),
    Iso3166Val("TR", "Turkey"),
    Iso3166Val("TM", "Turkmenistan"),
    Iso3166Val("TC", "Turks and Caicos Islands"),
    Iso3166Val("TV", "Tuvalu"),
    Iso3166Val("UG", "Uganda"),
    Iso3166Val("UA", "Ukraine"),
    Iso3166Val("AE", "United Arab Emirates"),
    Iso3166Val("GB", "United Kingdom"),
    Iso3166Val("US", "United States"),
    Iso3166Val("UM", "United States Minor Outlying Islands"),
    Iso3166Val("UY", "Uruguay"),
    Iso3166Val("UZ", "Uzbekistan"),
    Iso3166Val("VU", "Vanuatu"),
    Iso3166Val("VE", "Venezuela, Bolivarian Republic of"),
    Iso3166Val("VN", "Viet Nam"),
    Iso3166Val("VG", "Virgin Islands, British"),
    Iso3166Val("VI", "Virgin Islands, U.S."),
    Iso3166Val("WF", "Wallis and Futuna"),
    Iso3166Val("EH", "Western Sahara"),
    Iso3166Val("YE", "Yemen"),
    Iso3166Val("ZM", "Zambia"),
    Iso3166Val("ZW", "Zimbabwe")
  )

  val iso639Definitions: Seq[Iso639Val] = Iso639List_1.items ++ Iso639List_2.items ++ Iso639List_3.items ++ Iso639List_4.items ++ Iso639List_5.items ++ Iso639List_6.items ++ Iso639List_7.items ++ Iso639List_8.items ++ Iso639List_9.items ++ Iso639List_10.items
}
