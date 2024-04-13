package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Audits{

	@JsonProperty("render-blocking-resources")
	private RenderBlockingResources renderBlockingResources;

	@JsonProperty("unused-javascript")
	private UnusedJavascript unusedJavascript;

	@JsonProperty("table-fake-caption")
	private TableFakeCaption tableFakeCaption;

	@JsonProperty("plugins")
	private Plugins plugins;

	@JsonProperty("interactive")
	private Interactive interactive;

	@JsonProperty("valid-source-maps")
	private ValidSourceMaps validSourceMaps;

	@JsonProperty("aria-required-parent")
	private AriaRequiredParent ariaRequiredParent;

	@JsonProperty("csp-xss")
	private CspXss cspXss;

	@JsonProperty("third-party-facades")
	private ThirdPartyFacades thirdPartyFacades;

	@JsonProperty("duplicated-javascript")
	private DuplicatedJavascript duplicatedJavascript;

	@JsonProperty("network-rtt")
	private NetworkRtt networkRtt;

	@JsonProperty("network-server-latency")
	private NetworkServerLatency networkServerLatency;

	@JsonProperty("td-has-header")
	private TdHasHeader tdHasHeader;

	@JsonProperty("aria-meter-name")
	private AriaMeterName ariaMeterName;

	@JsonProperty("custom-controls-labels")
	private CustomControlsLabels customControlsLabels;

	@JsonProperty("aria-allowed-role")
	private AriaAllowedRole ariaAllowedRole;

	@JsonProperty("link-name")
	private LinkName linkName;

	@JsonProperty("unsized-images")
	private UnsizedImages unsizedImages;

	@JsonProperty("offscreen-images")
	private OffscreenImages offscreenImages;

	@JsonProperty("button-name")
	private ButtonName buttonName;

	@JsonProperty("third-party-summary")
	private ThirdPartySummary thirdPartySummary;

	@JsonProperty("unminified-css")
	private UnminifiedCss unminifiedCss;

	@JsonProperty("input-image-alt")
	private InputImageAlt inputImageAlt;

	@JsonProperty("aria-hidden-focus")
	private AriaHiddenFocus ariaHiddenFocus;

	@JsonProperty("uses-http2")
	private UsesHttp2 usesHttp2;

	@JsonProperty("identical-links-same-purpose")
	private IdenticalLinksSamePurpose identicalLinksSamePurpose;

	@JsonProperty("th-has-data-cells")
	private ThHasDataCells thHasDataCells;

	@JsonProperty("timing-budget")
	private TimingBudget timingBudget;

	@JsonProperty("tabindex")
	private Tabindex tabindex;

	@JsonProperty("uses-long-cache-ttl")
	private UsesLongCacheTtl usesLongCacheTtl;

	@JsonProperty("robots-txt")
	private RobotsTxt robotsTxt;

	@JsonProperty("aria-command-name")
	private AriaCommandName ariaCommandName;

	@JsonProperty("form-field-multiple-labels")
	private FormFieldMultipleLabels formFieldMultipleLabels;

	@JsonProperty("uses-responsive-images")
	private UsesResponsiveImages usesResponsiveImages;

	@JsonProperty("frame-title")
	private FrameTitle frameTitle;

	@JsonProperty("cumulative-layout-shift")
	private CumulativeLayoutShift cumulativeLayoutShift;

	@JsonProperty("managed-focus")
	private ManagedFocus managedFocus;

	@JsonProperty("pwa-cross-browser")
	private PwaCrossBrowser pwaCrossBrowser;

	@JsonProperty("metrics")
	private Metrics metrics;

	@JsonProperty("main-thread-tasks")
	private MainThreadTasks mainThreadTasks;

	@JsonProperty("prioritize-lcp-image")
	private PrioritizeLcpImage prioritizeLcpImage;

	@JsonProperty("charset")
	private Charset charset;

	@JsonProperty("layout-shifts")
	private LayoutShifts layoutShifts;

	@JsonProperty("target-size")
	private TargetSize targetSize;

	@JsonProperty("document-title")
	private DocumentTitle documentTitle;

	@JsonProperty("total-byte-weight")
	private TotalByteWeight totalByteWeight;

	@JsonProperty("aria-treeitem-name")
	private AriaTreeitemName ariaTreeitemName;

	@JsonProperty("logical-tab-order")
	private LogicalTabOrder logicalTabOrder;

	@JsonProperty("meta-refresh")
	private MetaRefresh metaRefresh;

	@JsonProperty("deprecations")
	private Deprecations deprecations;

	@JsonProperty("network-requests")
	private NetworkRequests networkRequests;

	@JsonProperty("link-text")
	private LinkText linkText;

	@JsonProperty("uses-rel-preload")
	private UsesRelPreload usesRelPreload;

	@JsonProperty("legacy-javascript")
	private LegacyJavascript legacyJavascript;

	@JsonProperty("inspector-issues")
	private InspectorIssues inspectorIssues;

	@JsonProperty("server-response-time")
	private ServerResponseTime serverResponseTime;

	@JsonProperty("dlitem")
	private Dlitem dlitem;

	@JsonProperty("uses-optimized-images")
	private UsesOptimizedImages usesOptimizedImages;

	@JsonProperty("errors-in-console")
	private ErrorsInConsole errorsInConsole;

	@JsonProperty("aria-dialog-name")
	private AriaDialogName ariaDialogName;

	@JsonProperty("video-caption")
	private VideoCaption videoCaption;

	@JsonProperty("td-headers-attr")
	private TdHeadersAttr tdHeadersAttr;

	@JsonProperty("paste-preventing-inputs")
	private PastePreventingInputs pastePreventingInputs;

	@JsonProperty("aria-progressbar-name")
	private AriaProgressbarName ariaProgressbarName;

	@JsonProperty("aria-tooltip-name")
	private AriaTooltipName ariaTooltipName;

	@JsonProperty("interactive-element-affordance")
	private InteractiveElementAffordance interactiveElementAffordance;

	@JsonProperty("image-redundant-alt")
	private ImageRedundantAlt imageRedundantAlt;

	@JsonProperty("offscreen-content-hidden")
	private OffscreenContentHidden offscreenContentHidden;

	@JsonProperty("no-document-write")
	private NoDocumentWrite noDocumentWrite;

	@JsonProperty("aria-valid-attr-value")
	private AriaValidAttrValue ariaValidAttrValue;

	@JsonProperty("link-in-text-block")
	private LinkInTextBlock linkInTextBlock;

	@JsonProperty("uses-text-compression")
	private UsesTextCompression usesTextCompression;

	@JsonProperty("preload-fonts")
	private PreloadFonts preloadFonts;

	@JsonProperty("largest-contentful-paint-element")
	private LargestContentfulPaintElement largestContentfulPaintElement;

	@JsonProperty("pwa-each-page-has-url")
	private PwaEachPageHasUrl pwaEachPageHasUrl;

	@JsonProperty("maskable-icon")
	private MaskableIcon maskableIcon;

	@JsonProperty("input-button-name")
	private InputButtonName inputButtonName;

	@JsonProperty("custom-controls-roles")
	private CustomControlsRoles customControlsRoles;

	@JsonProperty("doctype")
	private Doctype doctype;

	@JsonProperty("diagnostics")
	private Diagnostics diagnostics;

	@JsonProperty("layout-shift-elements")
	private LayoutShiftElements layoutShiftElements;

	@JsonProperty("meta-description")
	private MetaDescription metaDescription;

	@JsonProperty("html-xml-lang-mismatch")
	private HtmlXmlLangMismatch htmlXmlLangMismatch;

	@JsonProperty("modern-image-formats")
	private ModernImageFormats modernImageFormats;

	@JsonProperty("duplicate-id-active")
	private DuplicateIdActive duplicateIdActive;

	@JsonProperty("empty-heading")
	private EmptyHeading emptyHeading;

	@JsonProperty("focusable-controls")
	private FocusableControls focusableControls;

	@JsonProperty("themed-omnibox")
	private ThemedOmnibox themedOmnibox;

	@JsonProperty("color-contrast")
	private ColorContrast colorContrast;

	@JsonProperty("listitem")
	private Listitem listitem;

	@JsonProperty("tap-targets")
	private TapTargets tapTargets;

	@JsonProperty("table-duplicate-name")
	private TableDuplicateName tableDuplicateName;

	@JsonProperty("first-meaningful-paint")
	private FirstMeaningfulPaint firstMeaningfulPaint;

	@JsonProperty("focus-traps")
	private FocusTraps focusTraps;

	@JsonProperty("long-tasks")
	private LongTasks longTasks;

	@JsonProperty("aria-allowed-attr")
	private AriaAllowedAttr ariaAllowedAttr;

	@JsonProperty("geolocation-on-start")
	private GeolocationOnStart geolocationOnStart;

	@JsonProperty("image-aspect-ratio")
	private ImageAspectRatio imageAspectRatio;

	@JsonProperty("valid-lang")
	private ValidLang validLang;

	@JsonProperty("image-size-responsive")
	private ImageSizeResponsive imageSizeResponsive;

	@JsonProperty("aria-toggle-field-name")
	private AriaToggleFieldName ariaToggleFieldName;

	@JsonProperty("aria-hidden-body")
	private AriaHiddenBody ariaHiddenBody;

	@JsonProperty("skip-link")
	private SkipLink skipLink;

	@JsonProperty("html-has-lang")
	private HtmlHasLang htmlHasLang;

	@JsonProperty("unminified-javascript")
	private UnminifiedJavascript unminifiedJavascript;

	@JsonProperty("object-alt")
	private ObjectAlt objectAlt;

	@JsonProperty("accesskeys")
	private Accesskeys accesskeys;

	@JsonProperty("image-alt")
	private ImageAlt imageAlt;

	@JsonProperty("notification-on-start")
	private NotificationOnStart notificationOnStart;

	@JsonProperty("speed-index")
	private SpeedIndex speedIndex;

	@JsonProperty("unused-css-rules")
	private UnusedCssRules unusedCssRules;

	@JsonProperty("resource-summary")
	private ResourceSummary resourceSummary;

	@JsonProperty("structured-data")
	private StructuredData structuredData;

	@JsonProperty("content-width")
	private ContentWidth contentWidth;

	@JsonProperty("select-name")
	private SelectName selectName;

	@JsonProperty("largest-contentful-paint")
	private LargestContentfulPaint largestContentfulPaint;

	@JsonProperty("mainthread-work-breakdown")
	private MainthreadWorkBreakdown mainthreadWorkBreakdown;

	@JsonProperty("aria-text")
	private AriaText ariaText;

	@JsonProperty("canonical")
	private Canonical canonical;

	@JsonProperty("bootup-time")
	private BootupTime bootupTime;

	@JsonProperty("list")
	private List list;

	@JsonProperty("landmark-one-main")
	private LandmarkOneMain landmarkOneMain;

	@JsonProperty("js-libraries")
	private JsLibraries jsLibraries;

	@JsonProperty("hreflang")
	private Hreflang hreflang;

	@JsonProperty("performance-budget")
	private PerformanceBudget performanceBudget;

	@JsonProperty("is-crawlable")
	private IsCrawlable isCrawlable;

	@JsonProperty("use-landmarks")
	private UseLandmarks useLandmarks;

	@JsonProperty("critical-request-chains")
	private CriticalRequestChains criticalRequestChains;

	@JsonProperty("crawlable-anchors")
	private CrawlableAnchors crawlableAnchors;

	@JsonProperty("lcp-lazy-loaded")
	private LcpLazyLoaded lcpLazyLoaded;

	@JsonProperty("pwa-page-transitions")
	private PwaPageTransitions pwaPageTransitions;

	@JsonProperty("user-timings")
	private UserTimings userTimings;

	@JsonProperty("aria-input-field-name")
	private AriaInputFieldName ariaInputFieldName;

	@JsonProperty("font-size")
	private FontSize fontSize;

	@JsonProperty("aria-valid-attr")
	private AriaValidAttr ariaValidAttr;

	@JsonProperty("aria-required-attr")
	private AriaRequiredAttr ariaRequiredAttr;

	@JsonProperty("aria-roles")
	private AriaRoles ariaRoles;

	@JsonProperty("first-contentful-paint")
	private FirstContentfulPaint firstContentfulPaint;

	@JsonProperty("aria-required-children")
	private AriaRequiredChildren ariaRequiredChildren;

	@JsonProperty("dom-size")
	private DomSize domSize;

	@JsonProperty("efficient-animated-content")
	private EfficientAnimatedContent efficientAnimatedContent;

	@JsonProperty("uses-passive-event-listeners")
	private UsesPassiveEventListeners usesPassiveEventListeners;

	@JsonProperty("is-on-https")
	private IsOnHttps isOnHttps;

	@JsonProperty("total-blocking-time")
	private TotalBlockingTime totalBlockingTime;

	@JsonProperty("meta-viewport")
	private MetaViewport metaViewport;

	@JsonProperty("visual-order-follows-dom")
	private VisualOrderFollowsDom visualOrderFollowsDom;

	@JsonProperty("bf-cache")
	private BfCache bfCache;

	@JsonProperty("non-composited-animations")
	private NonCompositedAnimations nonCompositedAnimations;

	@JsonProperty("max-potential-fid")
	private MaxPotentialFid maxPotentialFid;

	@JsonProperty("definition-list")
	private DefinitionList definitionList;

	@JsonProperty("label-content-name-mismatch")
	private LabelContentNameMismatch labelContentNameMismatch;

	@JsonProperty("html-lang-valid")
	private HtmlLangValid htmlLangValid;

	@JsonProperty("splash-screen")
	private SplashScreen splashScreen;

	@JsonProperty("label")
	private Label label;

	@JsonProperty("installable-manifest")
	private InstallableManifest installableManifest;

	@JsonProperty("no-unload-listeners")
	private NoUnloadListeners noUnloadListeners;

	@JsonProperty("bypass")
	private Bypass bypass;

	@JsonProperty("http-status-code")
	private HttpStatusCode httpStatusCode;

	@JsonProperty("viewport")
	private Viewport viewport;

	@JsonProperty("redirects")
	private Redirects redirects;

	@JsonProperty("third-party-cookies")
	private ThirdPartyCookies thirdPartyCookies;

	@JsonProperty("uses-rel-preconnect")
	private UsesRelPreconnect usesRelPreconnect;

	@JsonProperty("font-display")
	private FontDisplay fontDisplay;

	@JsonProperty("duplicate-id-aria")
	private DuplicateIdAria duplicateIdAria;

	@JsonProperty("heading-order")
	private HeadingOrder headingOrder;

	@JsonProperty("script-treemap-data")
	private ScriptTreemapData scriptTreemapData;

	public void setRenderBlockingResources(RenderBlockingResources renderBlockingResources){
		this.renderBlockingResources = renderBlockingResources;
	}

	public RenderBlockingResources getRenderBlockingResources(){
		return renderBlockingResources;
	}

	public void setUnusedJavascript(UnusedJavascript unusedJavascript){
		this.unusedJavascript = unusedJavascript;
	}

	public UnusedJavascript getUnusedJavascript(){
		return unusedJavascript;
	}

	public void setTableFakeCaption(TableFakeCaption tableFakeCaption){
		this.tableFakeCaption = tableFakeCaption;
	}

	public TableFakeCaption getTableFakeCaption(){
		return tableFakeCaption;
	}

	public void setPlugins(Plugins plugins){
		this.plugins = plugins;
	}

	public Plugins getPlugins(){
		return plugins;
	}

	public void setInteractive(Interactive interactive){
		this.interactive = interactive;
	}

	public Interactive getInteractive(){
		return interactive;
	}

	public void setValidSourceMaps(ValidSourceMaps validSourceMaps){
		this.validSourceMaps = validSourceMaps;
	}

	public ValidSourceMaps getValidSourceMaps(){
		return validSourceMaps;
	}

	public void setAriaRequiredParent(AriaRequiredParent ariaRequiredParent){
		this.ariaRequiredParent = ariaRequiredParent;
	}

	public AriaRequiredParent getAriaRequiredParent(){
		return ariaRequiredParent;
	}

	public void setCspXss(CspXss cspXss){
		this.cspXss = cspXss;
	}

	public CspXss getCspXss(){
		return cspXss;
	}

	public void setThirdPartyFacades(ThirdPartyFacades thirdPartyFacades){
		this.thirdPartyFacades = thirdPartyFacades;
	}

	public ThirdPartyFacades getThirdPartyFacades(){
		return thirdPartyFacades;
	}

	public void setDuplicatedJavascript(DuplicatedJavascript duplicatedJavascript){
		this.duplicatedJavascript = duplicatedJavascript;
	}

	public DuplicatedJavascript getDuplicatedJavascript(){
		return duplicatedJavascript;
	}

	public void setNetworkRtt(NetworkRtt networkRtt){
		this.networkRtt = networkRtt;
	}

	public NetworkRtt getNetworkRtt(){
		return networkRtt;
	}

	public void setNetworkServerLatency(NetworkServerLatency networkServerLatency){
		this.networkServerLatency = networkServerLatency;
	}

	public NetworkServerLatency getNetworkServerLatency(){
		return networkServerLatency;
	}

	public void setTdHasHeader(TdHasHeader tdHasHeader){
		this.tdHasHeader = tdHasHeader;
	}

	public TdHasHeader getTdHasHeader(){
		return tdHasHeader;
	}

	public void setAriaMeterName(AriaMeterName ariaMeterName){
		this.ariaMeterName = ariaMeterName;
	}

	public AriaMeterName getAriaMeterName(){
		return ariaMeterName;
	}

	public void setCustomControlsLabels(CustomControlsLabels customControlsLabels){
		this.customControlsLabels = customControlsLabels;
	}

	public CustomControlsLabels getCustomControlsLabels(){
		return customControlsLabels;
	}

	public void setAriaAllowedRole(AriaAllowedRole ariaAllowedRole){
		this.ariaAllowedRole = ariaAllowedRole;
	}

	public AriaAllowedRole getAriaAllowedRole(){
		return ariaAllowedRole;
	}

	public void setLinkName(LinkName linkName){
		this.linkName = linkName;
	}

	public LinkName getLinkName(){
		return linkName;
	}

	public void setUnsizedImages(UnsizedImages unsizedImages){
		this.unsizedImages = unsizedImages;
	}

	public UnsizedImages getUnsizedImages(){
		return unsizedImages;
	}

	public void setOffscreenImages(OffscreenImages offscreenImages){
		this.offscreenImages = offscreenImages;
	}

	public OffscreenImages getOffscreenImages(){
		return offscreenImages;
	}

	public void setButtonName(ButtonName buttonName){
		this.buttonName = buttonName;
	}

	public ButtonName getButtonName(){
		return buttonName;
	}

	public void setThirdPartySummary(ThirdPartySummary thirdPartySummary){
		this.thirdPartySummary = thirdPartySummary;
	}

	public ThirdPartySummary getThirdPartySummary(){
		return thirdPartySummary;
	}

	public void setUnminifiedCss(UnminifiedCss unminifiedCss){
		this.unminifiedCss = unminifiedCss;
	}

	public UnminifiedCss getUnminifiedCss(){
		return unminifiedCss;
	}

	public void setInputImageAlt(InputImageAlt inputImageAlt){
		this.inputImageAlt = inputImageAlt;
	}

	public InputImageAlt getInputImageAlt(){
		return inputImageAlt;
	}

	public void setAriaHiddenFocus(AriaHiddenFocus ariaHiddenFocus){
		this.ariaHiddenFocus = ariaHiddenFocus;
	}

	public AriaHiddenFocus getAriaHiddenFocus(){
		return ariaHiddenFocus;
	}

	public void setUsesHttp2(UsesHttp2 usesHttp2){
		this.usesHttp2 = usesHttp2;
	}

	public UsesHttp2 getUsesHttp2(){
		return usesHttp2;
	}

	public void setIdenticalLinksSamePurpose(IdenticalLinksSamePurpose identicalLinksSamePurpose){
		this.identicalLinksSamePurpose = identicalLinksSamePurpose;
	}

	public IdenticalLinksSamePurpose getIdenticalLinksSamePurpose(){
		return identicalLinksSamePurpose;
	}

	public void setThHasDataCells(ThHasDataCells thHasDataCells){
		this.thHasDataCells = thHasDataCells;
	}

	public ThHasDataCells getThHasDataCells(){
		return thHasDataCells;
	}

	public void setTimingBudget(TimingBudget timingBudget){
		this.timingBudget = timingBudget;
	}

	public TimingBudget getTimingBudget(){
		return timingBudget;
	}

	public void setTabindex(Tabindex tabindex){
		this.tabindex = tabindex;
	}

	public Tabindex getTabindex(){
		return tabindex;
	}

	public void setUsesLongCacheTtl(UsesLongCacheTtl usesLongCacheTtl){
		this.usesLongCacheTtl = usesLongCacheTtl;
	}

	public UsesLongCacheTtl getUsesLongCacheTtl(){
		return usesLongCacheTtl;
	}

	public void setRobotsTxt(RobotsTxt robotsTxt){
		this.robotsTxt = robotsTxt;
	}

	public RobotsTxt getRobotsTxt(){
		return robotsTxt;
	}

	public void setAriaCommandName(AriaCommandName ariaCommandName){
		this.ariaCommandName = ariaCommandName;
	}

	public AriaCommandName getAriaCommandName(){
		return ariaCommandName;
	}

	public void setFormFieldMultipleLabels(FormFieldMultipleLabels formFieldMultipleLabels){
		this.formFieldMultipleLabels = formFieldMultipleLabels;
	}

	public FormFieldMultipleLabels getFormFieldMultipleLabels(){
		return formFieldMultipleLabels;
	}

	public void setUsesResponsiveImages(UsesResponsiveImages usesResponsiveImages){
		this.usesResponsiveImages = usesResponsiveImages;
	}

	public UsesResponsiveImages getUsesResponsiveImages(){
		return usesResponsiveImages;
	}

	public void setFrameTitle(FrameTitle frameTitle){
		this.frameTitle = frameTitle;
	}

	public FrameTitle getFrameTitle(){
		return frameTitle;
	}

	public void setCumulativeLayoutShift(CumulativeLayoutShift cumulativeLayoutShift){
		this.cumulativeLayoutShift = cumulativeLayoutShift;
	}

	public CumulativeLayoutShift getCumulativeLayoutShift(){
		return cumulativeLayoutShift;
	}

	public void setManagedFocus(ManagedFocus managedFocus){
		this.managedFocus = managedFocus;
	}

	public ManagedFocus getManagedFocus(){
		return managedFocus;
	}

	public void setPwaCrossBrowser(PwaCrossBrowser pwaCrossBrowser){
		this.pwaCrossBrowser = pwaCrossBrowser;
	}

	public PwaCrossBrowser getPwaCrossBrowser(){
		return pwaCrossBrowser;
	}

	public void setMetrics(Metrics metrics){
		this.metrics = metrics;
	}

	public Metrics getMetrics(){
		return metrics;
	}

	public void setMainThreadTasks(MainThreadTasks mainThreadTasks){
		this.mainThreadTasks = mainThreadTasks;
	}

	public MainThreadTasks getMainThreadTasks(){
		return mainThreadTasks;
	}

	public void setPrioritizeLcpImage(PrioritizeLcpImage prioritizeLcpImage){
		this.prioritizeLcpImage = prioritizeLcpImage;
	}

	public PrioritizeLcpImage getPrioritizeLcpImage(){
		return prioritizeLcpImage;
	}

	public void setCharset(Charset charset){
		this.charset = charset;
	}

	public Charset getCharset(){
		return charset;
	}

	public void setLayoutShifts(LayoutShifts layoutShifts){
		this.layoutShifts = layoutShifts;
	}

	public LayoutShifts getLayoutShifts(){
		return layoutShifts;
	}

	public void setTargetSize(TargetSize targetSize){
		this.targetSize = targetSize;
	}

	public TargetSize getTargetSize(){
		return targetSize;
	}

	public void setDocumentTitle(DocumentTitle documentTitle){
		this.documentTitle = documentTitle;
	}

	public DocumentTitle getDocumentTitle(){
		return documentTitle;
	}

	public void setTotalByteWeight(TotalByteWeight totalByteWeight){
		this.totalByteWeight = totalByteWeight;
	}

	public TotalByteWeight getTotalByteWeight(){
		return totalByteWeight;
	}

	public void setAriaTreeitemName(AriaTreeitemName ariaTreeitemName){
		this.ariaTreeitemName = ariaTreeitemName;
	}

	public AriaTreeitemName getAriaTreeitemName(){
		return ariaTreeitemName;
	}

	public void setLogicalTabOrder(LogicalTabOrder logicalTabOrder){
		this.logicalTabOrder = logicalTabOrder;
	}

	public LogicalTabOrder getLogicalTabOrder(){
		return logicalTabOrder;
	}

	public void setMetaRefresh(MetaRefresh metaRefresh){
		this.metaRefresh = metaRefresh;
	}

	public MetaRefresh getMetaRefresh(){
		return metaRefresh;
	}

	public void setDeprecations(Deprecations deprecations){
		this.deprecations = deprecations;
	}

	public Deprecations getDeprecations(){
		return deprecations;
	}

	public void setNetworkRequests(NetworkRequests networkRequests){
		this.networkRequests = networkRequests;
	}

	public NetworkRequests getNetworkRequests(){
		return networkRequests;
	}

	public void setLinkText(LinkText linkText){
		this.linkText = linkText;
	}

	public LinkText getLinkText(){
		return linkText;
	}

	public void setUsesRelPreload(UsesRelPreload usesRelPreload){
		this.usesRelPreload = usesRelPreload;
	}

	public UsesRelPreload getUsesRelPreload(){
		return usesRelPreload;
	}

	public void setLegacyJavascript(LegacyJavascript legacyJavascript){
		this.legacyJavascript = legacyJavascript;
	}

	public LegacyJavascript getLegacyJavascript(){
		return legacyJavascript;
	}

	public void setInspectorIssues(InspectorIssues inspectorIssues){
		this.inspectorIssues = inspectorIssues;
	}

	public InspectorIssues getInspectorIssues(){
		return inspectorIssues;
	}

	public void setServerResponseTime(ServerResponseTime serverResponseTime){
		this.serverResponseTime = serverResponseTime;
	}

	public ServerResponseTime getServerResponseTime(){
		return serverResponseTime;
	}

	public void setDlitem(Dlitem dlitem){
		this.dlitem = dlitem;
	}

	public Dlitem getDlitem(){
		return dlitem;
	}

	public void setUsesOptimizedImages(UsesOptimizedImages usesOptimizedImages){
		this.usesOptimizedImages = usesOptimizedImages;
	}

	public UsesOptimizedImages getUsesOptimizedImages(){
		return usesOptimizedImages;
	}

	public void setErrorsInConsole(ErrorsInConsole errorsInConsole){
		this.errorsInConsole = errorsInConsole;
	}

	public ErrorsInConsole getErrorsInConsole(){
		return errorsInConsole;
	}

	public void setAriaDialogName(AriaDialogName ariaDialogName){
		this.ariaDialogName = ariaDialogName;
	}

	public AriaDialogName getAriaDialogName(){
		return ariaDialogName;
	}

	public void setVideoCaption(VideoCaption videoCaption){
		this.videoCaption = videoCaption;
	}

	public VideoCaption getVideoCaption(){
		return videoCaption;
	}

	public void setTdHeadersAttr(TdHeadersAttr tdHeadersAttr){
		this.tdHeadersAttr = tdHeadersAttr;
	}

	public TdHeadersAttr getTdHeadersAttr(){
		return tdHeadersAttr;
	}

	public void setPastePreventingInputs(PastePreventingInputs pastePreventingInputs){
		this.pastePreventingInputs = pastePreventingInputs;
	}

	public PastePreventingInputs getPastePreventingInputs(){
		return pastePreventingInputs;
	}

	public void setAriaProgressbarName(AriaProgressbarName ariaProgressbarName){
		this.ariaProgressbarName = ariaProgressbarName;
	}

	public AriaProgressbarName getAriaProgressbarName(){
		return ariaProgressbarName;
	}

	public void setAriaTooltipName(AriaTooltipName ariaTooltipName){
		this.ariaTooltipName = ariaTooltipName;
	}

	public AriaTooltipName getAriaTooltipName(){
		return ariaTooltipName;
	}

	public void setInteractiveElementAffordance(InteractiveElementAffordance interactiveElementAffordance){
		this.interactiveElementAffordance = interactiveElementAffordance;
	}

	public InteractiveElementAffordance getInteractiveElementAffordance(){
		return interactiveElementAffordance;
	}

	public void setImageRedundantAlt(ImageRedundantAlt imageRedundantAlt){
		this.imageRedundantAlt = imageRedundantAlt;
	}

	public ImageRedundantAlt getImageRedundantAlt(){
		return imageRedundantAlt;
	}

	public void setOffscreenContentHidden(OffscreenContentHidden offscreenContentHidden){
		this.offscreenContentHidden = offscreenContentHidden;
	}

	public OffscreenContentHidden getOffscreenContentHidden(){
		return offscreenContentHidden;
	}

	public void setNoDocumentWrite(NoDocumentWrite noDocumentWrite){
		this.noDocumentWrite = noDocumentWrite;
	}

	public NoDocumentWrite getNoDocumentWrite(){
		return noDocumentWrite;
	}

	public void setAriaValidAttrValue(AriaValidAttrValue ariaValidAttrValue){
		this.ariaValidAttrValue = ariaValidAttrValue;
	}

	public AriaValidAttrValue getAriaValidAttrValue(){
		return ariaValidAttrValue;
	}

	public void setLinkInTextBlock(LinkInTextBlock linkInTextBlock){
		this.linkInTextBlock = linkInTextBlock;
	}

	public LinkInTextBlock getLinkInTextBlock(){
		return linkInTextBlock;
	}

	public void setUsesTextCompression(UsesTextCompression usesTextCompression){
		this.usesTextCompression = usesTextCompression;
	}

	public UsesTextCompression getUsesTextCompression(){
		return usesTextCompression;
	}

	public void setPreloadFonts(PreloadFonts preloadFonts){
		this.preloadFonts = preloadFonts;
	}

	public PreloadFonts getPreloadFonts(){
		return preloadFonts;
	}

	public void setLargestContentfulPaintElement(LargestContentfulPaintElement largestContentfulPaintElement){
		this.largestContentfulPaintElement = largestContentfulPaintElement;
	}

	public LargestContentfulPaintElement getLargestContentfulPaintElement(){
		return largestContentfulPaintElement;
	}

	public void setPwaEachPageHasUrl(PwaEachPageHasUrl pwaEachPageHasUrl){
		this.pwaEachPageHasUrl = pwaEachPageHasUrl;
	}

	public PwaEachPageHasUrl getPwaEachPageHasUrl(){
		return pwaEachPageHasUrl;
	}

	public void setMaskableIcon(MaskableIcon maskableIcon){
		this.maskableIcon = maskableIcon;
	}

	public MaskableIcon getMaskableIcon(){
		return maskableIcon;
	}

	public void setInputButtonName(InputButtonName inputButtonName){
		this.inputButtonName = inputButtonName;
	}

	public InputButtonName getInputButtonName(){
		return inputButtonName;
	}

	public void setCustomControlsRoles(CustomControlsRoles customControlsRoles){
		this.customControlsRoles = customControlsRoles;
	}

	public CustomControlsRoles getCustomControlsRoles(){
		return customControlsRoles;
	}

	public void setDoctype(Doctype doctype){
		this.doctype = doctype;
	}

	public Doctype getDoctype(){
		return doctype;
	}

	public void setDiagnostics(Diagnostics diagnostics){
		this.diagnostics = diagnostics;
	}

	public Diagnostics getDiagnostics(){
		return diagnostics;
	}

	public void setLayoutShiftElements(LayoutShiftElements layoutShiftElements){
		this.layoutShiftElements = layoutShiftElements;
	}

	public LayoutShiftElements getLayoutShiftElements(){
		return layoutShiftElements;
	}

	public void setMetaDescription(MetaDescription metaDescription){
		this.metaDescription = metaDescription;
	}

	public MetaDescription getMetaDescription(){
		return metaDescription;
	}

	public void setHtmlXmlLangMismatch(HtmlXmlLangMismatch htmlXmlLangMismatch){
		this.htmlXmlLangMismatch = htmlXmlLangMismatch;
	}

	public HtmlXmlLangMismatch getHtmlXmlLangMismatch(){
		return htmlXmlLangMismatch;
	}

	public void setModernImageFormats(ModernImageFormats modernImageFormats){
		this.modernImageFormats = modernImageFormats;
	}

	public ModernImageFormats getModernImageFormats(){
		return modernImageFormats;
	}

	public void setDuplicateIdActive(DuplicateIdActive duplicateIdActive){
		this.duplicateIdActive = duplicateIdActive;
	}

	public DuplicateIdActive getDuplicateIdActive(){
		return duplicateIdActive;
	}

	public void setEmptyHeading(EmptyHeading emptyHeading){
		this.emptyHeading = emptyHeading;
	}

	public EmptyHeading getEmptyHeading(){
		return emptyHeading;
	}

	public void setFocusableControls(FocusableControls focusableControls){
		this.focusableControls = focusableControls;
	}

	public FocusableControls getFocusableControls(){
		return focusableControls;
	}

	public void setThemedOmnibox(ThemedOmnibox themedOmnibox){
		this.themedOmnibox = themedOmnibox;
	}

	public ThemedOmnibox getThemedOmnibox(){
		return themedOmnibox;
	}

	public void setColorContrast(ColorContrast colorContrast){
		this.colorContrast = colorContrast;
	}

	public ColorContrast getColorContrast(){
		return colorContrast;
	}

	public void setListitem(Listitem listitem){
		this.listitem = listitem;
	}

	public Listitem getListitem(){
		return listitem;
	}

	public void setTapTargets(TapTargets tapTargets){
		this.tapTargets = tapTargets;
	}

	public TapTargets getTapTargets(){
		return tapTargets;
	}

	public void setTableDuplicateName(TableDuplicateName tableDuplicateName){
		this.tableDuplicateName = tableDuplicateName;
	}

	public TableDuplicateName getTableDuplicateName(){
		return tableDuplicateName;
	}

	public void setFirstMeaningfulPaint(FirstMeaningfulPaint firstMeaningfulPaint){
		this.firstMeaningfulPaint = firstMeaningfulPaint;
	}

	public FirstMeaningfulPaint getFirstMeaningfulPaint(){
		return firstMeaningfulPaint;
	}

	public void setFocusTraps(FocusTraps focusTraps){
		this.focusTraps = focusTraps;
	}

	public FocusTraps getFocusTraps(){
		return focusTraps;
	}

	public void setLongTasks(LongTasks longTasks){
		this.longTasks = longTasks;
	}

	public LongTasks getLongTasks(){
		return longTasks;
	}

	public void setAriaAllowedAttr(AriaAllowedAttr ariaAllowedAttr){
		this.ariaAllowedAttr = ariaAllowedAttr;
	}

	public AriaAllowedAttr getAriaAllowedAttr(){
		return ariaAllowedAttr;
	}

	public void setGeolocationOnStart(GeolocationOnStart geolocationOnStart){
		this.geolocationOnStart = geolocationOnStart;
	}

	public GeolocationOnStart getGeolocationOnStart(){
		return geolocationOnStart;
	}

	public void setImageAspectRatio(ImageAspectRatio imageAspectRatio){
		this.imageAspectRatio = imageAspectRatio;
	}

	public ImageAspectRatio getImageAspectRatio(){
		return imageAspectRatio;
	}

	public void setValidLang(ValidLang validLang){
		this.validLang = validLang;
	}

	public ValidLang getValidLang(){
		return validLang;
	}

	public void setImageSizeResponsive(ImageSizeResponsive imageSizeResponsive){
		this.imageSizeResponsive = imageSizeResponsive;
	}

	public ImageSizeResponsive getImageSizeResponsive(){
		return imageSizeResponsive;
	}

	public void setAriaToggleFieldName(AriaToggleFieldName ariaToggleFieldName){
		this.ariaToggleFieldName = ariaToggleFieldName;
	}

	public AriaToggleFieldName getAriaToggleFieldName(){
		return ariaToggleFieldName;
	}

	public void setAriaHiddenBody(AriaHiddenBody ariaHiddenBody){
		this.ariaHiddenBody = ariaHiddenBody;
	}

	public AriaHiddenBody getAriaHiddenBody(){
		return ariaHiddenBody;
	}

	public void setSkipLink(SkipLink skipLink){
		this.skipLink = skipLink;
	}

	public SkipLink getSkipLink(){
		return skipLink;
	}

	public void setHtmlHasLang(HtmlHasLang htmlHasLang){
		this.htmlHasLang = htmlHasLang;
	}

	public HtmlHasLang getHtmlHasLang(){
		return htmlHasLang;
	}

	public void setUnminifiedJavascript(UnminifiedJavascript unminifiedJavascript){
		this.unminifiedJavascript = unminifiedJavascript;
	}

	public UnminifiedJavascript getUnminifiedJavascript(){
		return unminifiedJavascript;
	}

	public void setObjectAlt(ObjectAlt objectAlt){
		this.objectAlt = objectAlt;
	}

	public ObjectAlt getObjectAlt(){
		return objectAlt;
	}

	public void setAccesskeys(Accesskeys accesskeys){
		this.accesskeys = accesskeys;
	}

	public Accesskeys getAccesskeys(){
		return accesskeys;
	}

	public void setImageAlt(ImageAlt imageAlt){
		this.imageAlt = imageAlt;
	}

	public ImageAlt getImageAlt(){
		return imageAlt;
	}

	public void setNotificationOnStart(NotificationOnStart notificationOnStart){
		this.notificationOnStart = notificationOnStart;
	}

	public NotificationOnStart getNotificationOnStart(){
		return notificationOnStart;
	}

	public void setSpeedIndex(SpeedIndex speedIndex){
		this.speedIndex = speedIndex;
	}

	public SpeedIndex getSpeedIndex(){
		return speedIndex;
	}

	public void setUnusedCssRules(UnusedCssRules unusedCssRules){
		this.unusedCssRules = unusedCssRules;
	}

	public UnusedCssRules getUnusedCssRules(){
		return unusedCssRules;
	}

	public void setResourceSummary(ResourceSummary resourceSummary){
		this.resourceSummary = resourceSummary;
	}

	public ResourceSummary getResourceSummary(){
		return resourceSummary;
	}

	public void setStructuredData(StructuredData structuredData){
		this.structuredData = structuredData;
	}

	public StructuredData getStructuredData(){
		return structuredData;
	}

	public void setContentWidth(ContentWidth contentWidth){
		this.contentWidth = contentWidth;
	}

	public ContentWidth getContentWidth(){
		return contentWidth;
	}

	public void setSelectName(SelectName selectName){
		this.selectName = selectName;
	}

	public SelectName getSelectName(){
		return selectName;
	}

	public void setLargestContentfulPaint(LargestContentfulPaint largestContentfulPaint){
		this.largestContentfulPaint = largestContentfulPaint;
	}

	public LargestContentfulPaint getLargestContentfulPaint(){
		return largestContentfulPaint;
	}

	public void setMainthreadWorkBreakdown(MainthreadWorkBreakdown mainthreadWorkBreakdown){
		this.mainthreadWorkBreakdown = mainthreadWorkBreakdown;
	}

	public MainthreadWorkBreakdown getMainthreadWorkBreakdown(){
		return mainthreadWorkBreakdown;
	}

	public void setAriaText(AriaText ariaText){
		this.ariaText = ariaText;
	}

	public AriaText getAriaText(){
		return ariaText;
	}

	public void setCanonical(Canonical canonical){
		this.canonical = canonical;
	}

	public Canonical getCanonical(){
		return canonical;
	}

	public void setBootupTime(BootupTime bootupTime){
		this.bootupTime = bootupTime;
	}

	public BootupTime getBootupTime(){
		return bootupTime;
	}

	public void setList(List list){
		this.list = list;
	}

	public List getList(){
		return list;
	}

	public void setLandmarkOneMain(LandmarkOneMain landmarkOneMain){
		this.landmarkOneMain = landmarkOneMain;
	}

	public LandmarkOneMain getLandmarkOneMain(){
		return landmarkOneMain;
	}

	public void setJsLibraries(JsLibraries jsLibraries){
		this.jsLibraries = jsLibraries;
	}

	public JsLibraries getJsLibraries(){
		return jsLibraries;
	}

	public void setHreflang(Hreflang hreflang){
		this.hreflang = hreflang;
	}

	public Hreflang getHreflang(){
		return hreflang;
	}

	public void setPerformanceBudget(PerformanceBudget performanceBudget){
		this.performanceBudget = performanceBudget;
	}

	public PerformanceBudget getPerformanceBudget(){
		return performanceBudget;
	}

	public void setIsCrawlable(IsCrawlable isCrawlable){
		this.isCrawlable = isCrawlable;
	}

	public IsCrawlable getIsCrawlable(){
		return isCrawlable;
	}

	public void setUseLandmarks(UseLandmarks useLandmarks){
		this.useLandmarks = useLandmarks;
	}

	public UseLandmarks getUseLandmarks(){
		return useLandmarks;
	}

	public void setCriticalRequestChains(CriticalRequestChains criticalRequestChains){
		this.criticalRequestChains = criticalRequestChains;
	}

	public CriticalRequestChains getCriticalRequestChains(){
		return criticalRequestChains;
	}

	public void setCrawlableAnchors(CrawlableAnchors crawlableAnchors){
		this.crawlableAnchors = crawlableAnchors;
	}

	public CrawlableAnchors getCrawlableAnchors(){
		return crawlableAnchors;
	}

	public void setLcpLazyLoaded(LcpLazyLoaded lcpLazyLoaded){
		this.lcpLazyLoaded = lcpLazyLoaded;
	}

	public LcpLazyLoaded getLcpLazyLoaded(){
		return lcpLazyLoaded;
	}

	public void setPwaPageTransitions(PwaPageTransitions pwaPageTransitions){
		this.pwaPageTransitions = pwaPageTransitions;
	}

	public PwaPageTransitions getPwaPageTransitions(){
		return pwaPageTransitions;
	}

	public void setUserTimings(UserTimings userTimings){
		this.userTimings = userTimings;
	}

	public UserTimings getUserTimings(){
		return userTimings;
	}

	public void setAriaInputFieldName(AriaInputFieldName ariaInputFieldName){
		this.ariaInputFieldName = ariaInputFieldName;
	}

	public AriaInputFieldName getAriaInputFieldName(){
		return ariaInputFieldName;
	}

	public void setFontSize(FontSize fontSize){
		this.fontSize = fontSize;
	}

	public FontSize getFontSize(){
		return fontSize;
	}

	public void setAriaValidAttr(AriaValidAttr ariaValidAttr){
		this.ariaValidAttr = ariaValidAttr;
	}

	public AriaValidAttr getAriaValidAttr(){
		return ariaValidAttr;
	}

	public void setAriaRequiredAttr(AriaRequiredAttr ariaRequiredAttr){
		this.ariaRequiredAttr = ariaRequiredAttr;
	}

	public AriaRequiredAttr getAriaRequiredAttr(){
		return ariaRequiredAttr;
	}

	public void setAriaRoles(AriaRoles ariaRoles){
		this.ariaRoles = ariaRoles;
	}

	public AriaRoles getAriaRoles(){
		return ariaRoles;
	}

	public void setFirstContentfulPaint(FirstContentfulPaint firstContentfulPaint){
		this.firstContentfulPaint = firstContentfulPaint;
	}

	public FirstContentfulPaint getFirstContentfulPaint(){
		return firstContentfulPaint;
	}

	public void setAriaRequiredChildren(AriaRequiredChildren ariaRequiredChildren){
		this.ariaRequiredChildren = ariaRequiredChildren;
	}

	public AriaRequiredChildren getAriaRequiredChildren(){
		return ariaRequiredChildren;
	}

	public void setDomSize(DomSize domSize){
		this.domSize = domSize;
	}

	public DomSize getDomSize(){
		return domSize;
	}

	public void setEfficientAnimatedContent(EfficientAnimatedContent efficientAnimatedContent){
		this.efficientAnimatedContent = efficientAnimatedContent;
	}

	public EfficientAnimatedContent getEfficientAnimatedContent(){
		return efficientAnimatedContent;
	}

	public void setUsesPassiveEventListeners(UsesPassiveEventListeners usesPassiveEventListeners){
		this.usesPassiveEventListeners = usesPassiveEventListeners;
	}

	public UsesPassiveEventListeners getUsesPassiveEventListeners(){
		return usesPassiveEventListeners;
	}

	public void setIsOnHttps(IsOnHttps isOnHttps){
		this.isOnHttps = isOnHttps;
	}

	public IsOnHttps getIsOnHttps(){
		return isOnHttps;
	}

	public void setTotalBlockingTime(TotalBlockingTime totalBlockingTime){
		this.totalBlockingTime = totalBlockingTime;
	}

	public TotalBlockingTime getTotalBlockingTime(){
		return totalBlockingTime;
	}

	public void setMetaViewport(MetaViewport metaViewport){
		this.metaViewport = metaViewport;
	}

	public MetaViewport getMetaViewport(){
		return metaViewport;
	}

	public void setVisualOrderFollowsDom(VisualOrderFollowsDom visualOrderFollowsDom){
		this.visualOrderFollowsDom = visualOrderFollowsDom;
	}

	public VisualOrderFollowsDom getVisualOrderFollowsDom(){
		return visualOrderFollowsDom;
	}

	public void setBfCache(BfCache bfCache){
		this.bfCache = bfCache;
	}

	public BfCache getBfCache(){
		return bfCache;
	}

	public void setNonCompositedAnimations(NonCompositedAnimations nonCompositedAnimations){
		this.nonCompositedAnimations = nonCompositedAnimations;
	}

	public NonCompositedAnimations getNonCompositedAnimations(){
		return nonCompositedAnimations;
	}

	public void setMaxPotentialFid(MaxPotentialFid maxPotentialFid){
		this.maxPotentialFid = maxPotentialFid;
	}

	public MaxPotentialFid getMaxPotentialFid(){
		return maxPotentialFid;
	}

	public void setDefinitionList(DefinitionList definitionList){
		this.definitionList = definitionList;
	}

	public DefinitionList getDefinitionList(){
		return definitionList;
	}

	public void setLabelContentNameMismatch(LabelContentNameMismatch labelContentNameMismatch){
		this.labelContentNameMismatch = labelContentNameMismatch;
	}

	public LabelContentNameMismatch getLabelContentNameMismatch(){
		return labelContentNameMismatch;
	}

	public void setHtmlLangValid(HtmlLangValid htmlLangValid){
		this.htmlLangValid = htmlLangValid;
	}

	public HtmlLangValid getHtmlLangValid(){
		return htmlLangValid;
	}

	public void setSplashScreen(SplashScreen splashScreen){
		this.splashScreen = splashScreen;
	}

	public SplashScreen getSplashScreen(){
		return splashScreen;
	}

	public void setLabel(Label label){
		this.label = label;
	}

	public Label getLabel(){
		return label;
	}

	public void setInstallableManifest(InstallableManifest installableManifest){
		this.installableManifest = installableManifest;
	}

	public InstallableManifest getInstallableManifest(){
		return installableManifest;
	}

	public void setNoUnloadListeners(NoUnloadListeners noUnloadListeners){
		this.noUnloadListeners = noUnloadListeners;
	}

	public NoUnloadListeners getNoUnloadListeners(){
		return noUnloadListeners;
	}

	public void setBypass(Bypass bypass){
		this.bypass = bypass;
	}

	public Bypass getBypass(){
		return bypass;
	}

	public void setHttpStatusCode(HttpStatusCode httpStatusCode){
		this.httpStatusCode = httpStatusCode;
	}

	public HttpStatusCode getHttpStatusCode(){
		return httpStatusCode;
	}

	public void setViewport(Viewport viewport){
		this.viewport = viewport;
	}

	public Viewport getViewport(){
		return viewport;
	}

	public void setRedirects(Redirects redirects){
		this.redirects = redirects;
	}

	public Redirects getRedirects(){
		return redirects;
	}

	public void setThirdPartyCookies(ThirdPartyCookies thirdPartyCookies){
		this.thirdPartyCookies = thirdPartyCookies;
	}

	public ThirdPartyCookies getThirdPartyCookies(){
		return thirdPartyCookies;
	}

	public void setUsesRelPreconnect(UsesRelPreconnect usesRelPreconnect){
		this.usesRelPreconnect = usesRelPreconnect;
	}

	public UsesRelPreconnect getUsesRelPreconnect(){
		return usesRelPreconnect;
	}

	public void setFontDisplay(FontDisplay fontDisplay){
		this.fontDisplay = fontDisplay;
	}

	public FontDisplay getFontDisplay(){
		return fontDisplay;
	}

	public void setDuplicateIdAria(DuplicateIdAria duplicateIdAria){
		this.duplicateIdAria = duplicateIdAria;
	}

	public DuplicateIdAria getDuplicateIdAria(){
		return duplicateIdAria;
	}

	public void setHeadingOrder(HeadingOrder headingOrder){
		this.headingOrder = headingOrder;
	}

	public HeadingOrder getHeadingOrder(){
		return headingOrder;
	}

	public void setScriptTreemapData(ScriptTreemapData scriptTreemapData){
		this.scriptTreemapData = scriptTreemapData;
	}

	public ScriptTreemapData getScriptTreemapData(){
		return scriptTreemapData;
	}

	@Override
 	public String toString(){
		return 
			"Audits{" + 
			"render-blocking-resources = '" + renderBlockingResources + '\'' + 
			",unused-javascript = '" + unusedJavascript + '\'' + 
			",table-fake-caption = '" + tableFakeCaption + '\'' + 
			",plugins = '" + plugins + '\'' + 
			",interactive = '" + interactive + '\'' + 
			",valid-source-maps = '" + validSourceMaps + '\'' + 
			",aria-required-parent = '" + ariaRequiredParent + '\'' + 
			",csp-xss = '" + cspXss + '\'' + 
			",third-party-facades = '" + thirdPartyFacades + '\'' + 
			",duplicated-javascript = '" + duplicatedJavascript + '\'' + 
			",network-rtt = '" + networkRtt + '\'' + 
			",network-server-latency = '" + networkServerLatency + '\'' + 
			",td-has-header = '" + tdHasHeader + '\'' + 
			",aria-meter-name = '" + ariaMeterName + '\'' + 
			",custom-controls-labels = '" + customControlsLabels + '\'' + 
			",aria-allowed-role = '" + ariaAllowedRole + '\'' + 
			",link-name = '" + linkName + '\'' + 
			",unsized-images = '" + unsizedImages + '\'' + 
			",offscreen-images = '" + offscreenImages + '\'' + 
			",button-name = '" + buttonName + '\'' + 
			",third-party-summary = '" + thirdPartySummary + '\'' + 
			",unminified-css = '" + unminifiedCss + '\'' + 
			",input-image-alt = '" + inputImageAlt + '\'' + 
			",aria-hidden-focus = '" + ariaHiddenFocus + '\'' + 
			",uses-http2 = '" + usesHttp2 + '\'' + 
			",identical-links-same-purpose = '" + identicalLinksSamePurpose + '\'' + 
			",th-has-data-cells = '" + thHasDataCells + '\'' + 
			",timing-budget = '" + timingBudget + '\'' + 
			",tabindex = '" + tabindex + '\'' + 
			",uses-long-cache-ttl = '" + usesLongCacheTtl + '\'' + 
			",robots-txt = '" + robotsTxt + '\'' + 
			",aria-command-name = '" + ariaCommandName + '\'' + 
			",form-field-multiple-labels = '" + formFieldMultipleLabels + '\'' + 
			",uses-responsive-images = '" + usesResponsiveImages + '\'' + 
			",frame-title = '" + frameTitle + '\'' + 
			",cumulative-layout-shift = '" + cumulativeLayoutShift + '\'' + 
			",managed-focus = '" + managedFocus + '\'' + 
			",pwa-cross-browser = '" + pwaCrossBrowser + '\'' + 
			",metrics = '" + metrics + '\'' + 
			",main-thread-tasks = '" + mainThreadTasks + '\'' + 
			",prioritize-lcp-image = '" + prioritizeLcpImage + '\'' + 
			",charset = '" + charset + '\'' + 
			",layout-shifts = '" + layoutShifts + '\'' + 
			",target-size = '" + targetSize + '\'' + 
			",document-title = '" + documentTitle + '\'' + 
			",total-byte-weight = '" + totalByteWeight + '\'' + 
			",aria-treeitem-name = '" + ariaTreeitemName + '\'' + 
			",logical-tab-order = '" + logicalTabOrder + '\'' + 
			",meta-refresh = '" + metaRefresh + '\'' + 
			",deprecations = '" + deprecations + '\'' + 
			",network-requests = '" + networkRequests + '\'' + 
			",link-text = '" + linkText + '\'' + 
			",uses-rel-preload = '" + usesRelPreload + '\'' + 
			",legacy-javascript = '" + legacyJavascript + '\'' + 
			",inspector-issues = '" + inspectorIssues + '\'' + 
			",server-response-time = '" + serverResponseTime + '\'' + 
			",dlitem = '" + dlitem + '\'' + 
			",uses-optimized-images = '" + usesOptimizedImages + '\'' + 
			",errors-in-console = '" + errorsInConsole + '\'' + 
			",aria-dialog-name = '" + ariaDialogName + '\'' + 
			",video-caption = '" + videoCaption + '\'' + 
			",td-headers-attr = '" + tdHeadersAttr + '\'' + 
			",paste-preventing-inputs = '" + pastePreventingInputs + '\'' + 
			",aria-progressbar-name = '" + ariaProgressbarName + '\'' + 
			",aria-tooltip-name = '" + ariaTooltipName + '\'' + 
			",interactive-element-affordance = '" + interactiveElementAffordance + '\'' + 
			",image-redundant-alt = '" + imageRedundantAlt + '\'' + 
			",offscreen-content-hidden = '" + offscreenContentHidden + '\'' + 
			",no-document-write = '" + noDocumentWrite + '\'' + 
			",aria-valid-attr-value = '" + ariaValidAttrValue + '\'' + 
			",link-in-text-block = '" + linkInTextBlock + '\'' + 
			",uses-text-compression = '" + usesTextCompression + '\'' + 
			",preload-fonts = '" + preloadFonts + '\'' + 
			",largest-contentful-paint-element = '" + largestContentfulPaintElement + '\'' + 
			",pwa-each-page-has-url = '" + pwaEachPageHasUrl + '\'' + 
			",maskable-icon = '" + maskableIcon + '\'' + 
			",input-button-name = '" + inputButtonName + '\'' + 
			",custom-controls-roles = '" + customControlsRoles + '\'' + 
			",doctype = '" + doctype + '\'' + 
			",diagnostics = '" + diagnostics + '\'' + 
			",layout-shift-elements = '" + layoutShiftElements + '\'' + 
			",meta-description = '" + metaDescription + '\'' + 
			",html-xml-lang-mismatch = '" + htmlXmlLangMismatch + '\'' + 
			",modern-image-formats = '" + modernImageFormats + '\'' + 
			",duplicate-id-active = '" + duplicateIdActive + '\'' + 
			",empty-heading = '" + emptyHeading + '\'' + 
			",focusable-controls = '" + focusableControls + '\'' + 
			",themed-omnibox = '" + themedOmnibox + '\'' + 
			",color-contrast = '" + colorContrast + '\'' + 
			",listitem = '" + listitem + '\'' + 
			",tap-targets = '" + tapTargets + '\'' + 
			",table-duplicate-name = '" + tableDuplicateName + '\'' + 
			",first-meaningful-paint = '" + firstMeaningfulPaint + '\'' + 
			",focus-traps = '" + focusTraps + '\'' + 
			",long-tasks = '" + longTasks + '\'' + 
			",aria-allowed-attr = '" + ariaAllowedAttr + '\'' + 
			",geolocation-on-start = '" + geolocationOnStart + '\'' + 
			",image-aspect-ratio = '" + imageAspectRatio + '\'' + 
			",valid-lang = '" + validLang + '\'' + 
			",image-size-responsive = '" + imageSizeResponsive + '\'' + 
			",aria-toggle-field-name = '" + ariaToggleFieldName + '\'' + 
			",aria-hidden-body = '" + ariaHiddenBody + '\'' + 
			",skip-link = '" + skipLink + '\'' + 
			",html-has-lang = '" + htmlHasLang + '\'' + 
			",unminified-javascript = '" + unminifiedJavascript + '\'' + 
			",object-alt = '" + objectAlt + '\'' + 
			",accesskeys = '" + accesskeys + '\'' + 
			",image-alt = '" + imageAlt + '\'' + 
			",notification-on-start = '" + notificationOnStart + '\'' + 
			",speed-index = '" + speedIndex + '\'' + 
			",unused-css-rules = '" + unusedCssRules + '\'' + 
			",resource-summary = '" + resourceSummary + '\'' + 
			",structured-data = '" + structuredData + '\'' + 
			",content-width = '" + contentWidth + '\'' + 
			",select-name = '" + selectName + '\'' + 
			",largest-contentful-paint = '" + largestContentfulPaint + '\'' + 
			",mainthread-work-breakdown = '" + mainthreadWorkBreakdown + '\'' + 
			",aria-text = '" + ariaText + '\'' + 
			",canonical = '" + canonical + '\'' + 
			",bootup-time = '" + bootupTime + '\'' + 
			",list = '" + list + '\'' + 
			",landmark-one-main = '" + landmarkOneMain + '\'' + 
			",js-libraries = '" + jsLibraries + '\'' + 
			",hreflang = '" + hreflang + '\'' + 
			",performance-budget = '" + performanceBudget + '\'' + 
			",is-crawlable = '" + isCrawlable + '\'' + 
			",use-landmarks = '" + useLandmarks + '\'' + 
			",critical-request-chains = '" + criticalRequestChains + '\'' + 
			",crawlable-anchors = '" + crawlableAnchors + '\'' + 
			",lcp-lazy-loaded = '" + lcpLazyLoaded + '\'' + 
			",pwa-page-transitions = '" + pwaPageTransitions + '\'' + 
			",user-timings = '" + userTimings + '\'' + 
			",aria-input-field-name = '" + ariaInputFieldName + '\'' + 
			",font-size = '" + fontSize + '\'' + 
			",aria-valid-attr = '" + ariaValidAttr + '\'' + 
			",aria-required-attr = '" + ariaRequiredAttr + '\'' + 
			",aria-roles = '" + ariaRoles + '\'' + 
			",first-contentful-paint = '" + firstContentfulPaint + '\'' + 
			",aria-required-children = '" + ariaRequiredChildren + '\'' + 
			",dom-size = '" + domSize + '\'' + 
			",efficient-animated-content = '" + efficientAnimatedContent + '\'' + 
			",uses-passive-event-listeners = '" + usesPassiveEventListeners + '\'' + 
			",is-on-https = '" + isOnHttps + '\'' + 
			",total-blocking-time = '" + totalBlockingTime + '\'' + 
			",meta-viewport = '" + metaViewport + '\'' + 
			",visual-order-follows-dom = '" + visualOrderFollowsDom + '\'' + 
			",bf-cache = '" + bfCache + '\'' + 
			",non-composited-animations = '" + nonCompositedAnimations + '\'' + 
			",max-potential-fid = '" + maxPotentialFid + '\'' + 
			",definition-list = '" + definitionList + '\'' + 
			",label-content-name-mismatch = '" + labelContentNameMismatch + '\'' + 
			",html-lang-valid = '" + htmlLangValid + '\'' + 
			",splash-screen = '" + splashScreen + '\'' + 
			",label = '" + label + '\'' + 
			",installable-manifest = '" + installableManifest + '\'' + 
			",no-unload-listeners = '" + noUnloadListeners + '\'' + 
			",bypass = '" + bypass + '\'' + 
			",http-status-code = '" + httpStatusCode + '\'' + 
			",viewport = '" + viewport + '\'' + 
			",redirects = '" + redirects + '\'' + 
			",third-party-cookies = '" + thirdPartyCookies + '\'' + 
			",uses-rel-preconnect = '" + usesRelPreconnect + '\'' + 
			",font-display = '" + fontDisplay + '\'' + 
			",duplicate-id-aria = '" + duplicateIdAria + '\'' + 
			",heading-order = '" + headingOrder + '\'' + 
			",script-treemap-data = '" + scriptTreemapData + '\'' + 
			"}";
		}
}