(ns fulcro.incubator.ui.icons.font-awesome
  (:refer-clojure :exclude [clone comment filter key list map print repeat sort])
  (:require ["react-icons/lib/fa" :as fa]
            [fulcro.client.dom :as dom]
            [fulcro.incubator.ui.core :as uc]))

(def i500px (uc/wrap-simple fa/Fa500px))
(def adjust (uc/wrap-simple fa/FaAdjust))
(def adn (uc/wrap-simple fa/FaAdn))
(def align-center (uc/wrap-simple fa/FaAlignCenter))
(def align-justify (uc/wrap-simple fa/FaAlignJustify))
(def align-left (uc/wrap-simple fa/FaAlignLeft))
(def align-right (uc/wrap-simple fa/FaAlignRight))
(def amazon (uc/wrap-simple fa/FaAmazon))
(def ambulance (uc/wrap-simple fa/FaAmbulance))
(def american-sign-language-interpreting (uc/wrap-simple fa/FaAmericanSignLanguageInterpreting))
(def anchor (uc/wrap-simple fa/FaAnchor))
(def android (uc/wrap-simple fa/FaAndroid))
(def angellist (uc/wrap-simple fa/FaAngellist))
(def angle-double-down (uc/wrap-simple fa/FaAngleDoubleDown))
(def angle-double-left (uc/wrap-simple fa/FaAngleDoubleLeft))
(def angle-double-right (uc/wrap-simple fa/FaAngleDoubleRight))
(def angle-double-up (uc/wrap-simple fa/FaAngleDoubleUp))
(def angle-down (uc/wrap-simple fa/FaAngleDown))
(def angle-left (uc/wrap-simple fa/FaAngleLeft))
(def angle-right (uc/wrap-simple fa/FaAngleRight))
(def angle-up (uc/wrap-simple fa/FaAngleUp))
(def apple (uc/wrap-simple fa/FaApple))
(def archive (uc/wrap-simple fa/FaArchive))
(def area-chart (uc/wrap-simple fa/FaAreaChart))
(def arrow-circle-down (uc/wrap-simple fa/FaArrowCircleDown))
(def arrow-circle-left (uc/wrap-simple fa/FaArrowCircleLeft))
(def arrow-circle-o-down (uc/wrap-simple fa/FaArrowCircleODown))
(def arrow-circle-o-left (uc/wrap-simple fa/FaArrowCircleOLeft))
(def arrow-circle-o-right (uc/wrap-simple fa/FaArrowCircleORight))
(def arrow-circle-o-up (uc/wrap-simple fa/FaArrowCircleOUp))
(def arrow-circle-right (uc/wrap-simple fa/FaArrowCircleRight))
(def arrow-circle-up (uc/wrap-simple fa/FaArrowCircleUp))
(def arrow-down (uc/wrap-simple fa/FaArrowDown))
(def arrow-left (uc/wrap-simple fa/FaArrowLeft))
(def arrow-right (uc/wrap-simple fa/FaArrowRight))
(def arrow-up (uc/wrap-simple fa/FaArrowUp))
(def arrows (uc/wrap-simple fa/FaArrows))
(def arrows-alt (uc/wrap-simple fa/FaArrowsAlt))
(def arrows-h (uc/wrap-simple fa/FaArrowsH))
(def arrows-v (uc/wrap-simple fa/FaArrowsV))
(def assistive-listening-systems (uc/wrap-simple fa/FaAssistiveListeningSystems))
(def asterisk (uc/wrap-simple fa/FaAsterisk))
(def at (uc/wrap-simple fa/FaAt))
(def audio-description (uc/wrap-simple fa/FaAudioDescription))
(def automobile (uc/wrap-simple fa/FaAutomobile))
(def backward (uc/wrap-simple fa/FaBackward))
(def balance-scale (uc/wrap-simple fa/FaBalanceScale))
(def ban (uc/wrap-simple fa/FaBan))
(def bank (uc/wrap-simple fa/FaBank))
(def bar-chart (uc/wrap-simple fa/FaBarChart))
(def barcode (uc/wrap-simple fa/FaBarcode))
(def bars (uc/wrap-simple fa/FaBars))
(def battery-0 (uc/wrap-simple fa/FaBattery0))
(def battery-1 (uc/wrap-simple fa/FaBattery1))
(def battery-2 (uc/wrap-simple fa/FaBattery2))
(def battery-3 (uc/wrap-simple fa/FaBattery3))
(def battery-4 (uc/wrap-simple fa/FaBattery4))
(def bed (uc/wrap-simple fa/FaBed))
(def beer (uc/wrap-simple fa/FaBeer))
(def behance (uc/wrap-simple fa/FaBehance))
(def behance-square (uc/wrap-simple fa/FaBehanceSquare))
(def bell (uc/wrap-simple fa/FaBell))
(def bell-o (uc/wrap-simple fa/FaBellO))
(def bell-slash (uc/wrap-simple fa/FaBellSlash))
(def bell-slash-o (uc/wrap-simple fa/FaBellSlashO))
(def bicycle (uc/wrap-simple fa/FaBicycle))
(def binoculars (uc/wrap-simple fa/FaBinoculars))
(def birthday-cake (uc/wrap-simple fa/FaBirthdayCake))
(def bitbucket (uc/wrap-simple fa/FaBitbucket))
(def bitbucket-square (uc/wrap-simple fa/FaBitbucketSquare))
(def bitcoin (uc/wrap-simple fa/FaBitcoin))
(def black-tie (uc/wrap-simple fa/FaBlackTie))
(def blind (uc/wrap-simple fa/FaBlind))
(def bluetooth (uc/wrap-simple fa/FaBluetooth))
(def bluetooth-b (uc/wrap-simple fa/FaBluetoothB))
(def bold (uc/wrap-simple fa/FaBold))
(def bolt (uc/wrap-simple fa/FaBolt))
(def bomb (uc/wrap-simple fa/FaBomb))
(def book (uc/wrap-simple fa/FaBook))
(def bookmark (uc/wrap-simple fa/FaBookmark))
(def bookmark-o (uc/wrap-simple fa/FaBookmarkO))
(def braille (uc/wrap-simple fa/FaBraille))
(def briefcase (uc/wrap-simple fa/FaBriefcase))
(def bug (uc/wrap-simple fa/FaBug))
(def building (uc/wrap-simple fa/FaBuilding))
(def building-o (uc/wrap-simple fa/FaBuildingO))
(def bullhorn (uc/wrap-simple fa/FaBullhorn))
(def bullseye (uc/wrap-simple fa/FaBullseye))
(def bus (uc/wrap-simple fa/FaBus))
(def buysellads (uc/wrap-simple fa/FaBuysellads))
(def cab (uc/wrap-simple fa/FaCab))
(def calculator (uc/wrap-simple fa/FaCalculator))
(def calendar (uc/wrap-simple fa/FaCalendar))
(def calendar-check-o (uc/wrap-simple fa/FaCalendarCheckO))
(def calendar-minus-o (uc/wrap-simple fa/FaCalendarMinusO))
(def calendar-o (uc/wrap-simple fa/FaCalendarO))
(def calendar-plus-o (uc/wrap-simple fa/FaCalendarPlusO))
(def calendar-times-o (uc/wrap-simple fa/FaCalendarTimesO))
(def camera (uc/wrap-simple fa/FaCamera))
(def camera-retro (uc/wrap-simple fa/FaCameraRetro))
(def caret-down (uc/wrap-simple fa/FaCaretDown))
(def caret-left (uc/wrap-simple fa/FaCaretLeft))
(def caret-right (uc/wrap-simple fa/FaCaretRight))
(def caret-square-o-down (uc/wrap-simple fa/FaCaretSquareODown))
(def caret-square-o-left (uc/wrap-simple fa/FaCaretSquareOLeft))
(def caret-square-o-right (uc/wrap-simple fa/FaCaretSquareORight))
(def caret-square-o-up (uc/wrap-simple fa/FaCaretSquareOUp))
(def caret-up (uc/wrap-simple fa/FaCaretUp))
(def cart-arrow-down (uc/wrap-simple fa/FaCartArrowDown))
(def cart-plus (uc/wrap-simple fa/FaCartPlus))
(def cc (uc/wrap-simple fa/FaCc))
(def cc-amex (uc/wrap-simple fa/FaCcAmex))
(def cc-diners-club (uc/wrap-simple fa/FaCcDinersClub))
(def cc-discover (uc/wrap-simple fa/FaCcDiscover))
(def cc-jcb (uc/wrap-simple fa/FaCcJcb))
(def cc-mastercard (uc/wrap-simple fa/FaCcMastercard))
(def cc-paypal (uc/wrap-simple fa/FaCcPaypal))
(def cc-stripe (uc/wrap-simple fa/FaCcStripe))
(def cc-visa (uc/wrap-simple fa/FaCcVisa))
(def certificate (uc/wrap-simple fa/FaCertificate))
(def chain (uc/wrap-simple fa/FaChain))
(def chain-broken (uc/wrap-simple fa/FaChainBroken))
(def check (uc/wrap-simple fa/FaCheck))
(def check-circle (uc/wrap-simple fa/FaCheckCircle))
(def check-circle-o (uc/wrap-simple fa/FaCheckCircleO))
(def check-square (uc/wrap-simple fa/FaCheckSquare))
(def check-square-o (uc/wrap-simple fa/FaCheckSquareO))
(def chevron-circle-down (uc/wrap-simple fa/FaChevronCircleDown))
(def chevron-circle-left (uc/wrap-simple fa/FaChevronCircleLeft))
(def chevron-circle-right (uc/wrap-simple fa/FaChevronCircleRight))
(def chevron-circle-up (uc/wrap-simple fa/FaChevronCircleUp))
(def chevron-down (uc/wrap-simple fa/FaChevronDown))
(def chevron-left (uc/wrap-simple fa/FaChevronLeft))
(def chevron-right (uc/wrap-simple fa/FaChevronRight))
(def chevron-up (uc/wrap-simple fa/FaChevronUp))
(def child (uc/wrap-simple fa/FaChild))
(def chrome (uc/wrap-simple fa/FaChrome))
(def circle (uc/wrap-simple fa/FaCircle))
(def circle-o (uc/wrap-simple fa/FaCircleO))
(def circle-o-notch (uc/wrap-simple fa/FaCircleONotch))
(def circle-thin (uc/wrap-simple fa/FaCircleThin))
(def clipboard (uc/wrap-simple fa/FaClipboard))
(def clock-o (uc/wrap-simple fa/FaClockO))
(def clone (uc/wrap-simple fa/FaClone))
(def close (uc/wrap-simple fa/FaClose))
(def cloud (uc/wrap-simple fa/FaCloud))
(def cloud-download (uc/wrap-simple fa/FaCloudDownload))
(def cloud-upload (uc/wrap-simple fa/FaCloudUpload))
(def cny (uc/wrap-simple fa/FaCny))
(def code (uc/wrap-simple fa/FaCode))
(def code-fork (uc/wrap-simple fa/FaCodeFork))
(def codepen (uc/wrap-simple fa/FaCodepen))
(def codiepie (uc/wrap-simple fa/FaCodiepie))
(def coffee (uc/wrap-simple fa/FaCoffee))
(def cog (uc/wrap-simple fa/FaCog))
(def cogs (uc/wrap-simple fa/FaCogs))
(def columns (uc/wrap-simple fa/FaColumns))
(def comment (uc/wrap-simple fa/FaComment))
(def comment-o (uc/wrap-simple fa/FaCommentO))
(def commenting (uc/wrap-simple fa/FaCommenting))
(def commenting-o (uc/wrap-simple fa/FaCommentingO))
(def comments (uc/wrap-simple fa/FaComments))
(def comments-o (uc/wrap-simple fa/FaCommentsO))
(def compass (uc/wrap-simple fa/FaCompass))
(def compress (uc/wrap-simple fa/FaCompress))
(def connectdevelop (uc/wrap-simple fa/FaConnectdevelop))
(def contao (uc/wrap-simple fa/FaContao))
(def copy (uc/wrap-simple fa/FaCopy))
(def copyright (uc/wrap-simple fa/FaCopyright))
(def creative-commons (uc/wrap-simple fa/FaCreativeCommons))
(def credit-card (uc/wrap-simple fa/FaCreditCard))
(def credit-card-alt (uc/wrap-simple fa/FaCreditCardAlt))
(def crop (uc/wrap-simple fa/FaCrop))
(def crosshairs (uc/wrap-simple fa/FaCrosshairs))
(def css3 (uc/wrap-simple fa/FaCss3))
(def cube (uc/wrap-simple fa/FaCube))
(def cubes (uc/wrap-simple fa/FaCubes))
(def cut (uc/wrap-simple fa/FaCut))
(def cutlery (uc/wrap-simple fa/FaCutlery))
(def dashboard (uc/wrap-simple fa/FaDashboard))
(def dashcube (uc/wrap-simple fa/FaDashcube))
(def database (uc/wrap-simple fa/FaDatabase))
(def deaf (uc/wrap-simple fa/FaDeaf))
(def dedent (uc/wrap-simple fa/FaDedent))
(def delicious (uc/wrap-simple fa/FaDelicious))
(def desktop (uc/wrap-simple fa/FaDesktop))
(def deviantart (uc/wrap-simple fa/FaDeviantart))
(def diamond (uc/wrap-simple fa/FaDiamond))
(def digg (uc/wrap-simple fa/FaDigg))
(def dollar (uc/wrap-simple fa/FaDollar))
(def dot-circle-o (uc/wrap-simple fa/FaDotCircleO))
(def download (uc/wrap-simple fa/FaDownload))
(def dribbble (uc/wrap-simple fa/FaDribbble))
(def dropbox (uc/wrap-simple fa/FaDropbox))
(def drupal (uc/wrap-simple fa/FaDrupal))
(def edge (uc/wrap-simple fa/FaEdge))
(def edit (uc/wrap-simple fa/FaEdit))
(def eject (uc/wrap-simple fa/FaEject))
(def ellipsis-h (uc/wrap-simple fa/FaEllipsisH))
(def ellipsis-v (uc/wrap-simple fa/FaEllipsisV))
(def empire (uc/wrap-simple fa/FaEmpire))
(def envelope (uc/wrap-simple fa/FaEnvelope))
(def envelope-o (uc/wrap-simple fa/FaEnvelopeO))
(def envelope-square (uc/wrap-simple fa/FaEnvelopeSquare))
(def envira (uc/wrap-simple fa/FaEnvira))
(def eraser (uc/wrap-simple fa/FaEraser))
(def eur (uc/wrap-simple fa/FaEur))
(def exchange (uc/wrap-simple fa/FaExchange))
(def exclamation (uc/wrap-simple fa/FaExclamation))
(def exclamation-circle (uc/wrap-simple fa/FaExclamationCircle))
(def exclamation-triangle (uc/wrap-simple fa/FaExclamationTriangle))
(def expand (uc/wrap-simple fa/FaExpand))
(def expeditedssl (uc/wrap-simple fa/FaExpeditedssl))
(def external-link (uc/wrap-simple fa/FaExternalLink))
(def external-link-square (uc/wrap-simple fa/FaExternalLinkSquare))
(def eye (uc/wrap-simple fa/FaEye))
(def eye-slash (uc/wrap-simple fa/FaEyeSlash))
(def eyedropper (uc/wrap-simple fa/FaEyedropper))
(def facebook (uc/wrap-simple fa/FaFacebook))
(def facebook-official (uc/wrap-simple fa/FaFacebookOfficial))
(def facebook-square (uc/wrap-simple fa/FaFacebookSquare))
(def fast-backward (uc/wrap-simple fa/FaFastBackward))
(def fast-forward (uc/wrap-simple fa/FaFastForward))
(def fax (uc/wrap-simple fa/FaFax))
(def feed (uc/wrap-simple fa/FaFeed))
(def female (uc/wrap-simple fa/FaFemale))
(def fighter-jet (uc/wrap-simple fa/FaFighterJet))
(def file (uc/wrap-simple fa/FaFile))
(def file-archive-o (uc/wrap-simple fa/FaFileArchiveO))
(def file-audio-o (uc/wrap-simple fa/FaFileAudioO))
(def file-code-o (uc/wrap-simple fa/FaFileCodeO))
(def file-excel-o (uc/wrap-simple fa/FaFileExcelO))
(def file-image-o (uc/wrap-simple fa/FaFileImageO))
(def file-movie-o (uc/wrap-simple fa/FaFileMovieO))
(def file-o (uc/wrap-simple fa/FaFileO))
(def file-pdf-o (uc/wrap-simple fa/FaFilePdfO))
(def file-powerpoint-o (uc/wrap-simple fa/FaFilePowerpointO))
(def file-text (uc/wrap-simple fa/FaFileText))
(def file-text-o (uc/wrap-simple fa/FaFileTextO))
(def file-word-o (uc/wrap-simple fa/FaFileWordO))
(def film (uc/wrap-simple fa/FaFilm))
(def filter (uc/wrap-simple fa/FaFilter))
(def fire (uc/wrap-simple fa/FaFire))
(def fire-extinguisher (uc/wrap-simple fa/FaFireExtinguisher))
(def firefox (uc/wrap-simple fa/FaFirefox))
(def flag (uc/wrap-simple fa/FaFlag))
(def flag-checkered (uc/wrap-simple fa/FaFlagCheckered))
(def flag-o (uc/wrap-simple fa/FaFlagO))
(def flask (uc/wrap-simple fa/FaFlask))
(def flickr (uc/wrap-simple fa/FaFlickr))
(def floppy-o (uc/wrap-simple fa/FaFloppyO))
(def folder (uc/wrap-simple fa/FaFolder))
(def folder-o (uc/wrap-simple fa/FaFolderO))
(def folder-open (uc/wrap-simple fa/FaFolderOpen))
(def folder-open-o (uc/wrap-simple fa/FaFolderOpenO))
(def font (uc/wrap-simple fa/FaFont))
(def fonticons (uc/wrap-simple fa/FaFonticons))
(def fort-awesome (uc/wrap-simple fa/FaFortAwesome))
(def forumbee (uc/wrap-simple fa/FaForumbee))
(def forward (uc/wrap-simple fa/FaForward))
(def foursquare (uc/wrap-simple fa/FaFoursquare))
(def frown-o (uc/wrap-simple fa/FaFrownO))
(def futbol-o (uc/wrap-simple fa/FaFutbolO))
(def gamepad (uc/wrap-simple fa/FaGamepad))
(def gavel (uc/wrap-simple fa/FaGavel))
(def gbp (uc/wrap-simple fa/FaGbp))
(def genderless (uc/wrap-simple fa/FaGenderless))
(def get-pocket (uc/wrap-simple fa/FaGetPocket))
(def gg (uc/wrap-simple fa/FaGg))
(def gg-circle (uc/wrap-simple fa/FaGgCircle))
(def gift (uc/wrap-simple fa/FaGift))
(def git (uc/wrap-simple fa/FaGit))
(def git-square (uc/wrap-simple fa/FaGitSquare))
(def github (uc/wrap-simple fa/FaGithub))
(def github-alt (uc/wrap-simple fa/FaGithubAlt))
(def github-square (uc/wrap-simple fa/FaGithubSquare))
(def gitlab (uc/wrap-simple fa/FaGitlab))
(def gittip (uc/wrap-simple fa/FaGittip))
(def glass (uc/wrap-simple fa/FaGlass))
(def glide (uc/wrap-simple fa/FaGlide))
(def glide-g (uc/wrap-simple fa/FaGlideG))
(def globe (uc/wrap-simple fa/FaGlobe))
(def google (uc/wrap-simple fa/FaGoogle))
(def google-plus (uc/wrap-simple fa/FaGooglePlus))
(def google-plus-square (uc/wrap-simple fa/FaGooglePlusSquare))
(def google-wallet (uc/wrap-simple fa/FaGoogleWallet))
(def graduation-cap (uc/wrap-simple fa/FaGraduationCap))
(def group (uc/wrap-simple fa/FaGroup))
(def h-square (uc/wrap-simple fa/FaHSquare))
(def hacker-news (uc/wrap-simple fa/FaHackerNews))
(def hand-grab-o (uc/wrap-simple fa/FaHandGrabO))
(def hand-lizard-o (uc/wrap-simple fa/FaHandLizardO))
(def hand-o-down (uc/wrap-simple fa/FaHandODown))
(def hand-o-left (uc/wrap-simple fa/FaHandOLeft))
(def hand-o-right (uc/wrap-simple fa/FaHandORight))
(def hand-o-up (uc/wrap-simple fa/FaHandOUp))
(def hand-paper-o (uc/wrap-simple fa/FaHandPaperO))
(def hand-peace-o (uc/wrap-simple fa/FaHandPeaceO))
(def hand-pointer-o (uc/wrap-simple fa/FaHandPointerO))
(def hand-scissors-o (uc/wrap-simple fa/FaHandScissorsO))
(def hand-spock-o (uc/wrap-simple fa/FaHandSpockO))
(def hashtag (uc/wrap-simple fa/FaHashtag))
(def hdd-o (uc/wrap-simple fa/FaHddO))
(def header (uc/wrap-simple fa/FaHeader))
(def headphones (uc/wrap-simple fa/FaHeadphones))
(def heart (uc/wrap-simple fa/FaHeart))
(def heart-o (uc/wrap-simple fa/FaHeartO))
(def heartbeat (uc/wrap-simple fa/FaHeartbeat))
(def history (uc/wrap-simple fa/FaHistory))
(def home (uc/wrap-simple fa/FaHome))
(def hospital-o (uc/wrap-simple fa/FaHospitalO))
(def hourglass (uc/wrap-simple fa/FaHourglass))
(def hourglass-1 (uc/wrap-simple fa/FaHourglass1))
(def hourglass-2 (uc/wrap-simple fa/FaHourglass2))
(def hourglass-3 (uc/wrap-simple fa/FaHourglass3))
(def hourglass-o (uc/wrap-simple fa/FaHourglassO))
(def houzz (uc/wrap-simple fa/FaHouzz))
(def html5 (uc/wrap-simple fa/FaHtml5))
(def i-cursor (uc/wrap-simple fa/FaICursor))
(def ils (uc/wrap-simple fa/FaIls))
(def image (uc/wrap-simple fa/FaImage))
(def inbox (uc/wrap-simple fa/FaInbox))
(def indent (uc/wrap-simple fa/FaIndent))
(def index (uc/wrap-simple fa/FaIndex))
(def industry (uc/wrap-simple fa/FaIndustry))
(def info (uc/wrap-simple fa/FaInfo))
(def info-circle (uc/wrap-simple fa/FaInfoCircle))
(def inr (uc/wrap-simple fa/FaInr))
(def instagram (uc/wrap-simple fa/FaInstagram))
(def internet-explorer (uc/wrap-simple fa/FaInternetExplorer))
(def intersex (uc/wrap-simple fa/FaIntersex))
(def ioxhost (uc/wrap-simple fa/FaIoxhost))
(def italic (uc/wrap-simple fa/FaItalic))
(def joomla (uc/wrap-simple fa/FaJoomla))
(def jsfiddle (uc/wrap-simple fa/FaJsfiddle))
(def key (uc/wrap-simple fa/FaKey))
(def keyboard-o (uc/wrap-simple fa/FaKeyboardO))
(def krw (uc/wrap-simple fa/FaKrw))
(def language (uc/wrap-simple fa/FaLanguage))
(def laptop (uc/wrap-simple fa/FaLaptop))
(def lastfm (uc/wrap-simple fa/FaLastfm))
(def lastfm-square (uc/wrap-simple fa/FaLastfmSquare))
(def leaf (uc/wrap-simple fa/FaLeaf))
(def leanpub (uc/wrap-simple fa/FaLeanpub))
(def lemon-o (uc/wrap-simple fa/FaLemonO))
(def level-down (uc/wrap-simple fa/FaLevelDown))
(def level-up (uc/wrap-simple fa/FaLevelUp))
(def life-bouy (uc/wrap-simple fa/FaLifeBouy))
(def lightbulb-o (uc/wrap-simple fa/FaLightbulbO))
(def line-chart (uc/wrap-simple fa/FaLineChart))
(def linkedin (uc/wrap-simple fa/FaLinkedin))
(def linkedin-square (uc/wrap-simple fa/FaLinkedinSquare))
(def linux (uc/wrap-simple fa/FaLinux))
(def list (uc/wrap-simple fa/FaList))
(def list-alt (uc/wrap-simple fa/FaListAlt))
(def list-ol (uc/wrap-simple fa/FaListOl))
(def list-ul (uc/wrap-simple fa/FaListUl))
(def location-arrow (uc/wrap-simple fa/FaLocationArrow))
(def lock (uc/wrap-simple fa/FaLock))
(def long-arrow-down (uc/wrap-simple fa/FaLongArrowDown))
(def long-arrow-left (uc/wrap-simple fa/FaLongArrowLeft))
(def long-arrow-right (uc/wrap-simple fa/FaLongArrowRight))
(def long-arrow-up (uc/wrap-simple fa/FaLongArrowUp))
(def low-vision (uc/wrap-simple fa/FaLowVision))
(def magic (uc/wrap-simple fa/FaMagic))
(def magnet (uc/wrap-simple fa/FaMagnet))
(def mail-forward (uc/wrap-simple fa/FaMailForward))
(def mail-reply (uc/wrap-simple fa/FaMailReply))
(def mail-reply-all (uc/wrap-simple fa/FaMailReplyAll))
(def male (uc/wrap-simple fa/FaMale))
(def map (uc/wrap-simple fa/FaMap))
(def map-marker (uc/wrap-simple fa/FaMapMarker))
(def map-o (uc/wrap-simple fa/FaMapO))
(def map-pin (uc/wrap-simple fa/FaMapPin))
(def map-signs (uc/wrap-simple fa/FaMapSigns))
(def mars (uc/wrap-simple fa/FaMars))
(def mars-double (uc/wrap-simple fa/FaMarsDouble))
(def mars-stroke (uc/wrap-simple fa/FaMarsStroke))
(def mars-stroke-h (uc/wrap-simple fa/FaMarsStrokeH))
(def mars-stroke-v (uc/wrap-simple fa/FaMarsStrokeV))
(def maxcdn (uc/wrap-simple fa/FaMaxcdn))
(def meanpath (uc/wrap-simple fa/FaMeanpath))
(def medium (uc/wrap-simple fa/FaMedium))
(def medkit (uc/wrap-simple fa/FaMedkit))
(def meh-o (uc/wrap-simple fa/FaMehO))
(def mercury (uc/wrap-simple fa/FaMercury))
(def microphone (uc/wrap-simple fa/FaMicrophone))
(def microphone-slash (uc/wrap-simple fa/FaMicrophoneSlash))
(def minus (uc/wrap-simple fa/FaMinus))
(def minus-circle (uc/wrap-simple fa/FaMinusCircle))
(def minus-square (uc/wrap-simple fa/FaMinusSquare))
(def minus-square-o (uc/wrap-simple fa/FaMinusSquareO))
(def mixcloud (uc/wrap-simple fa/FaMixcloud))
(def mobile (uc/wrap-simple fa/FaMobile))
(def modx (uc/wrap-simple fa/FaModx))
(def money (uc/wrap-simple fa/FaMoney))
(def moon-o (uc/wrap-simple fa/FaMoonO))
(def motorcycle (uc/wrap-simple fa/FaMotorcycle))
(def mouse-pointer (uc/wrap-simple fa/FaMousePointer))
(def music (uc/wrap-simple fa/FaMusic))
(def neuter (uc/wrap-simple fa/FaNeuter))
(def newspaper-o (uc/wrap-simple fa/FaNewspaperO))
(def object-group (uc/wrap-simple fa/FaObjectGroup))
(def object-ungroup (uc/wrap-simple fa/FaObjectUngroup))
(def odnoklassniki (uc/wrap-simple fa/FaOdnoklassniki))
(def odnoklassniki-square (uc/wrap-simple fa/FaOdnoklassnikiSquare))
(def opencart (uc/wrap-simple fa/FaOpencart))
(def openid (uc/wrap-simple fa/FaOpenid))
(def opera (uc/wrap-simple fa/FaOpera))
(def optin-monster (uc/wrap-simple fa/FaOptinMonster))
(def pagelines (uc/wrap-simple fa/FaPagelines))
(def paint-brush (uc/wrap-simple fa/FaPaintBrush))
(def paper-plane (uc/wrap-simple fa/FaPaperPlane))
(def paper-plane-o (uc/wrap-simple fa/FaPaperPlaneO))
(def paperclip (uc/wrap-simple fa/FaPaperclip))
(def paragraph (uc/wrap-simple fa/FaParagraph))
(def pause (uc/wrap-simple fa/FaPause))
(def pause-circle (uc/wrap-simple fa/FaPauseCircle))
(def pause-circle-o (uc/wrap-simple fa/FaPauseCircleO))
(def paw (uc/wrap-simple fa/FaPaw))
(def paypal (uc/wrap-simple fa/FaPaypal))
(def pencil (uc/wrap-simple fa/FaPencil))
(def pencil-square (uc/wrap-simple fa/FaPencilSquare))
(def percent (uc/wrap-simple fa/FaPercent))
(def phone (uc/wrap-simple fa/FaPhone))
(def phone-square (uc/wrap-simple fa/FaPhoneSquare))
(def pie-chart (uc/wrap-simple fa/FaPieChart))
(def pied-piper (uc/wrap-simple fa/FaPiedPiper))
(def pied-piper-alt (uc/wrap-simple fa/FaPiedPiperAlt))
(def pinterest (uc/wrap-simple fa/FaPinterest))
(def pinterest-p (uc/wrap-simple fa/FaPinterestP))
(def pinterest-square (uc/wrap-simple fa/FaPinterestSquare))
(def plane (uc/wrap-simple fa/FaPlane))
(def play (uc/wrap-simple fa/FaPlay))
(def play-circle (uc/wrap-simple fa/FaPlayCircle))
(def play-circle-o (uc/wrap-simple fa/FaPlayCircleO))
(def plug (uc/wrap-simple fa/FaPlug))
(def plus (uc/wrap-simple fa/FaPlus))
(def plus-circle (uc/wrap-simple fa/FaPlusCircle))
(def plus-square (uc/wrap-simple fa/FaPlusSquare))
(def plus-square-o (uc/wrap-simple fa/FaPlusSquareO))
(def power-off (uc/wrap-simple fa/FaPowerOff))
(def print (uc/wrap-simple fa/FaPrint))
(def product-hunt (uc/wrap-simple fa/FaProductHunt))
(def puzzle-piece (uc/wrap-simple fa/FaPuzzlePiece))
(def qq (uc/wrap-simple fa/FaQq))
(def qrcode (uc/wrap-simple fa/FaQrcode))
(def question (uc/wrap-simple fa/FaQuestion))
(def question-circle (uc/wrap-simple fa/FaQuestionCircle))
(def question-circle-o (uc/wrap-simple fa/FaQuestionCircleO))
(def quote-left (uc/wrap-simple fa/FaQuoteLeft))
(def quote-right (uc/wrap-simple fa/FaQuoteRight))
(def ra (uc/wrap-simple fa/FaRa))
(def random (uc/wrap-simple fa/FaRandom))
(def recycle (uc/wrap-simple fa/FaRecycle))
(def reddit (uc/wrap-simple fa/FaReddit))
(def reddit-alien (uc/wrap-simple fa/FaRedditAlien))
(def reddit-square (uc/wrap-simple fa/FaRedditSquare))
(def refresh (uc/wrap-simple fa/FaRefresh))
(def registered (uc/wrap-simple fa/FaRegistered))
(def renren (uc/wrap-simple fa/FaRenren))
(def repeat (uc/wrap-simple fa/FaRepeat))
(def retweet (uc/wrap-simple fa/FaRetweet))
(def road (uc/wrap-simple fa/FaRoad))
(def rocket (uc/wrap-simple fa/FaRocket))
(def rotate-left (uc/wrap-simple fa/FaRotateLeft))
(def rouble (uc/wrap-simple fa/FaRouble))
(def rss-square (uc/wrap-simple fa/FaRssSquare))
(def safari (uc/wrap-simple fa/FaSafari))
(def scribd (uc/wrap-simple fa/FaScribd))
(def search (uc/wrap-simple fa/FaSearch))
(def search-minus (uc/wrap-simple fa/FaSearchMinus))
(def search-plus (uc/wrap-simple fa/FaSearchPlus))
(def sellsy (uc/wrap-simple fa/FaSellsy))
(def server (uc/wrap-simple fa/FaServer))
(def share-alt (uc/wrap-simple fa/FaShareAlt))
(def share-alt-square (uc/wrap-simple fa/FaShareAltSquare))
(def share-square (uc/wrap-simple fa/FaShareSquare))
(def share-square-o (uc/wrap-simple fa/FaShareSquareO))
(def shield (uc/wrap-simple fa/FaShield))
(def ship (uc/wrap-simple fa/FaShip))
(def shirtsinbulk (uc/wrap-simple fa/FaShirtsinbulk))
(def shopping-bag (uc/wrap-simple fa/FaShoppingBag))
(def shopping-basket (uc/wrap-simple fa/FaShoppingBasket))
(def shopping-cart (uc/wrap-simple fa/FaShoppingCart))
(def sign-in (uc/wrap-simple fa/FaSignIn))
(def sign-language (uc/wrap-simple fa/FaSignLanguage))
(def sign-out (uc/wrap-simple fa/FaSignOut))
(def signal (uc/wrap-simple fa/FaSignal))
(def simplybuilt (uc/wrap-simple fa/FaSimplybuilt))
(def sitemap (uc/wrap-simple fa/FaSitemap))
(def skyatlas (uc/wrap-simple fa/FaSkyatlas))
(def skype (uc/wrap-simple fa/FaSkype))
(def slack (uc/wrap-simple fa/FaSlack))
(def sliders (uc/wrap-simple fa/FaSliders))
(def slideshare (uc/wrap-simple fa/FaSlideshare))
(def smile-o (uc/wrap-simple fa/FaSmileO))
(def snapchat (uc/wrap-simple fa/FaSnapchat))
(def snapchat-ghost (uc/wrap-simple fa/FaSnapchatGhost))
(def snapchat-square (uc/wrap-simple fa/FaSnapchatSquare))
(def sort (uc/wrap-simple fa/FaSort))
(def sort-alpha-asc (uc/wrap-simple fa/FaSortAlphaAsc))
(def sort-alpha-desc (uc/wrap-simple fa/FaSortAlphaDesc))
(def sort-amount-asc (uc/wrap-simple fa/FaSortAmountAsc))
(def sort-amount-desc (uc/wrap-simple fa/FaSortAmountDesc))
(def sort-asc (uc/wrap-simple fa/FaSortAsc))
(def sort-desc (uc/wrap-simple fa/FaSortDesc))
(def sort-numeric-asc (uc/wrap-simple fa/FaSortNumericAsc))
(def sort-numeric-desc (uc/wrap-simple fa/FaSortNumericDesc))
(def soundcloud (uc/wrap-simple fa/FaSoundcloud))
(def space-shuttle (uc/wrap-simple fa/FaSpaceShuttle))
(def spinner (uc/wrap-simple fa/FaSpinner))
(def spoon (uc/wrap-simple fa/FaSpoon))
(def spotify (uc/wrap-simple fa/FaSpotify))
(def square (uc/wrap-simple fa/FaSquare))
(def square-o (uc/wrap-simple fa/FaSquareO))
(def stack-exchange (uc/wrap-simple fa/FaStackExchange))
(def stack-overflow (uc/wrap-simple fa/FaStackOverflow))
(def star (uc/wrap-simple fa/FaStar))
(def star-half (uc/wrap-simple fa/FaStarHalf))
(def star-half-empty (uc/wrap-simple fa/FaStarHalfEmpty))
(def star-o (uc/wrap-simple fa/FaStarO))
(def steam (uc/wrap-simple fa/FaSteam))
(def steam-square (uc/wrap-simple fa/FaSteamSquare))
(def step-backward (uc/wrap-simple fa/FaStepBackward))
(def step-forward (uc/wrap-simple fa/FaStepForward))
(def stethoscope (uc/wrap-simple fa/FaStethoscope))
(def sticky-note (uc/wrap-simple fa/FaStickyNote))
(def sticky-note-o (uc/wrap-simple fa/FaStickyNoteO))
(def stop (uc/wrap-simple fa/FaStop))
(def stop-circle (uc/wrap-simple fa/FaStopCircle))
(def stop-circle-o (uc/wrap-simple fa/FaStopCircleO))
(def street-view (uc/wrap-simple fa/FaStreetView))
(def strikethrough (uc/wrap-simple fa/FaStrikethrough))
(def stumbleupon (uc/wrap-simple fa/FaStumbleupon))
(def stumbleupon-circle (uc/wrap-simple fa/FaStumbleuponCircle))
(def subscript (uc/wrap-simple fa/FaSubscript))
(def subway (uc/wrap-simple fa/FaSubway))
(def suitcase (uc/wrap-simple fa/FaSuitcase))
(def sun-o (uc/wrap-simple fa/FaSunO))
(def superscript (uc/wrap-simple fa/FaSuperscript))
(def table (uc/wrap-simple fa/FaTable))
(def tablet (uc/wrap-simple fa/FaTablet))
(def tag (uc/wrap-simple fa/FaTag))
(def tags (uc/wrap-simple fa/FaTags))
(def tasks (uc/wrap-simple fa/FaTasks))
(def television (uc/wrap-simple fa/FaTelevision))
(def tencent-weibo (uc/wrap-simple fa/FaTencentWeibo))
(def terminal (uc/wrap-simple fa/FaTerminal))
(def text-height (uc/wrap-simple fa/FaTextHeight))
(def text-width (uc/wrap-simple fa/FaTextWidth))
(def th (uc/wrap-simple fa/FaTh))
(def th-large (uc/wrap-simple fa/FaThLarge))
(def th-list (uc/wrap-simple fa/FaThList))
(def thumb-tack (uc/wrap-simple fa/FaThumbTack))
(def thumbs-down (uc/wrap-simple fa/FaThumbsDown))
(def thumbs-o-down (uc/wrap-simple fa/FaThumbsODown))
(def thumbs-o-up (uc/wrap-simple fa/FaThumbsOUp))
(def thumbs-up (uc/wrap-simple fa/FaThumbsUp))
(def ticket (uc/wrap-simple fa/FaTicket))
(def times-circle (uc/wrap-simple fa/FaTimesCircle))
(def times-circle-o (uc/wrap-simple fa/FaTimesCircleO))
(def tint (uc/wrap-simple fa/FaTint))
(def toggle-off (uc/wrap-simple fa/FaToggleOff))
(def toggle-on (uc/wrap-simple fa/FaToggleOn))
(def trademark (uc/wrap-simple fa/FaTrademark))
(def train (uc/wrap-simple fa/FaTrain))
(def transgender-alt (uc/wrap-simple fa/FaTransgenderAlt))
(def trash (uc/wrap-simple fa/FaTrash))
(def trash-o (uc/wrap-simple fa/FaTrashO))
(def tree (uc/wrap-simple fa/FaTree))
(def trello (uc/wrap-simple fa/FaTrello))
(def tripadvisor (uc/wrap-simple fa/FaTripadvisor))
(def trophy (uc/wrap-simple fa/FaTrophy))
(def truck (uc/wrap-simple fa/FaTruck))
(def try (uc/wrap-simple fa/FaTry))
(def tty (uc/wrap-simple fa/FaTty))
(def tumblr (uc/wrap-simple fa/FaTumblr))
(def tumblr-square (uc/wrap-simple fa/FaTumblrSquare))
(def twitch (uc/wrap-simple fa/FaTwitch))
(def twitter (uc/wrap-simple fa/FaTwitter))
(def twitter-square (uc/wrap-simple fa/FaTwitterSquare))
(def umbrella (uc/wrap-simple fa/FaUmbrella))
(def underline (uc/wrap-simple fa/FaUnderline))
(def universal-access (uc/wrap-simple fa/FaUniversalAccess))
(def unlock (uc/wrap-simple fa/FaUnlock))
(def unlock-alt (uc/wrap-simple fa/FaUnlockAlt))
(def upload (uc/wrap-simple fa/FaUpload))
(def usb (uc/wrap-simple fa/FaUsb))
(def user (uc/wrap-simple fa/FaUser))
(def user-md (uc/wrap-simple fa/FaUserMd))
(def user-plus (uc/wrap-simple fa/FaUserPlus))
(def user-secret (uc/wrap-simple fa/FaUserSecret))
(def user-times (uc/wrap-simple fa/FaUserTimes))
(def venus (uc/wrap-simple fa/FaVenus))
(def venus-double (uc/wrap-simple fa/FaVenusDouble))
(def venus-mars (uc/wrap-simple fa/FaVenusMars))
(def viacoin (uc/wrap-simple fa/FaViacoin))
(def viadeo (uc/wrap-simple fa/FaViadeo))
(def viadeo-square (uc/wrap-simple fa/FaViadeoSquare))
(def video-camera (uc/wrap-simple fa/FaVideoCamera))
(def vimeo (uc/wrap-simple fa/FaVimeo))
(def vimeo-square (uc/wrap-simple fa/FaVimeoSquare))
(def vine (uc/wrap-simple fa/FaVine))
(def vk (uc/wrap-simple fa/FaVk))
(def volume-control-phone (uc/wrap-simple fa/FaVolumeControlPhone))
(def volume-down (uc/wrap-simple fa/FaVolumeDown))
(def volume-off (uc/wrap-simple fa/FaVolumeOff))
(def volume-up (uc/wrap-simple fa/FaVolumeUp))
(def wechat (uc/wrap-simple fa/FaWechat))
(def weibo (uc/wrap-simple fa/FaWeibo))
(def whatsapp (uc/wrap-simple fa/FaWhatsapp))
(def wheelchair (uc/wrap-simple fa/FaWheelchair))
(def wheelchair-alt (uc/wrap-simple fa/FaWheelchairAlt))
(def wifi (uc/wrap-simple fa/FaWifi))
(def wikipedia-w (uc/wrap-simple fa/FaWikipediaW))
(def windows (uc/wrap-simple fa/FaWindows))
(def wordpress (uc/wrap-simple fa/FaWordpress))
(def wpbeginner (uc/wrap-simple fa/FaWpbeginner))
(def wpforms (uc/wrap-simple fa/FaWpforms))
(def wrench (uc/wrap-simple fa/FaWrench))
(def xing (uc/wrap-simple fa/FaXing))
(def xing-square (uc/wrap-simple fa/FaXingSquare))
(def y-combinator (uc/wrap-simple fa/FaYCombinator))
(def yahoo (uc/wrap-simple fa/FaYahoo))
(def yelp (uc/wrap-simple fa/FaYelp))
(def youtube (uc/wrap-simple fa/FaYoutube))
(def youtube-play (uc/wrap-simple fa/FaYoutubePlay))
(def youtube-square (uc/wrap-simple fa/FaYoutubeSquare))
