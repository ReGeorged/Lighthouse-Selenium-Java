package dev.regeorged.lighthouse.reports.model.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemsItem{

	@JsonProperty("wastedMs")
	private Integer wastedMs;

	@JsonProperty("totalBytes")
	private Integer totalBytes;

	@JsonProperty("url")
	private String url;

	@JsonProperty("wastedPercent")
	private Object wastedPercent;

	@JsonProperty("wastedBytes")
	private Integer wastedBytes;

	@JsonProperty("scriptUrl")
	private String scriptUrl;

	@JsonProperty("subItems")
	private SubItems subItems;

	@JsonProperty("error")
	private String error;

	@JsonProperty("severity")
	private String severity;

	@JsonProperty("description")
	private String description;

	@JsonProperty("directive")
	private String directive;

	@JsonProperty("rtt")
	private Object rtt;

	@JsonProperty("origin")
	private String origin;

	@JsonProperty("serverResponseTime")
	private Object serverResponseTime;

	@JsonProperty("node")
	private Node node;

	@JsonProperty("requestStartTime")
	private Object requestStartTime;

	@JsonProperty("transferSize")
	private Integer transferSize;

	@JsonProperty("blockingTime")
	private Object blockingTime;

	@JsonProperty("tbtImpact")
	private Object tbtImpact;

	@JsonProperty("mainThreadTime")
	private Object mainThreadTime;

	@JsonProperty("entity")
	private String entity;

	@JsonProperty("cacheLifetimeMs")
	private Integer cacheLifetimeMs;

	@JsonProperty("cacheHitProbability")
	private Integer cacheHitProbability;

	@JsonProperty("line")
	private String line;

	@JsonProperty("index")
	private String index;

	@JsonProperty("message")
	private String message;

	@JsonProperty("newEngineResult")
	private NewEngineResult newEngineResult;

	@JsonProperty("newEngineResultDiffered")
	private Boolean newEngineResultDiffered;

	@JsonProperty("cumulativeLayoutShiftMainFrame")
	private Integer cumulativeLayoutShiftMainFrame;

	@JsonProperty("lcpInvalidated")
	private Boolean lcpInvalidated;

	@JsonProperty("cumulativeLayoutShift")
	private Integer cumulativeLayoutShift;

	@JsonProperty("observedLargestContentfulPaintTs")
	private Long observedLargestContentfulPaintTs;

	@JsonProperty("lcpLoadEnd")
	private Integer lcpLoadEnd;

	@JsonProperty("interactive")
	private Integer interactive;

	@JsonProperty("observedDomContentLoadedTs")
	private Long observedDomContentLoadedTs;

	@JsonProperty("observedCumulativeLayoutShiftMainFrame")
	private Integer observedCumulativeLayoutShiftMainFrame;

	@JsonProperty("observedNavigationStart")
	private Integer observedNavigationStart;

	@JsonProperty("observedSpeedIndex")
	private Integer observedSpeedIndex;

	@JsonProperty("observedSpeedIndexTs")
	private Long observedSpeedIndexTs;

	@JsonProperty("observedFirstContentfulPaintTs")
	private Long observedFirstContentfulPaintTs;

	@JsonProperty("observedFirstContentfulPaintAllFramesTs")
	private Long observedFirstContentfulPaintAllFramesTs;

	@JsonProperty("observedFirstVisualChange")
	private Integer observedFirstVisualChange;

	@JsonProperty("observedLastVisualChange")
	private Integer observedLastVisualChange;

	@JsonProperty("observedFirstContentfulPaint")
	private Integer observedFirstContentfulPaint;

	@JsonProperty("totalBlockingTime")
	private Integer totalBlockingTime;

	@JsonProperty("maxPotentialFID")
	private Integer maxPotentialFID;

	@JsonProperty("observedNavigationStartTs")
	private Long observedNavigationStartTs;

	@JsonProperty("observedLargestContentfulPaint")
	private Integer observedLargestContentfulPaint;

	@JsonProperty("observedFirstPaintTs")
	private Long observedFirstPaintTs;

	@JsonProperty("observedFirstMeaningfulPaintTs")
	private Long observedFirstMeaningfulPaintTs;

	@JsonProperty("observedCumulativeLayoutShift")
	private Integer observedCumulativeLayoutShift;

	@JsonProperty("observedLastVisualChangeTs")
	private Long observedLastVisualChangeTs;

	@JsonProperty("observedTimeOrigin")
	private Integer observedTimeOrigin;

	@JsonProperty("observedFirstVisualChangeTs")
	private Long observedFirstVisualChangeTs;

	@JsonProperty("observedFirstPaint")
	private Integer observedFirstPaint;

	@JsonProperty("lcpLoadStart")
	private Integer lcpLoadStart;

	@JsonProperty("observedTraceEnd")
	private Integer observedTraceEnd;

	@JsonProperty("observedFirstContentfulPaintAllFrames")
	private Integer observedFirstContentfulPaintAllFrames;

	@JsonProperty("firstMeaningfulPaint")
	private Integer firstMeaningfulPaint;

	@JsonProperty("observedTraceEndTs")
	private Long observedTraceEndTs;

	@JsonProperty("observedFirstMeaningfulPaint")
	private Integer observedFirstMeaningfulPaint;

	@JsonProperty("largestContentfulPaint")
	private Integer largestContentfulPaint;

	@JsonProperty("timeToFirstByte")
	private Integer timeToFirstByte;

	@JsonProperty("observedLargestContentfulPaintAllFramesTs")
	private Long observedLargestContentfulPaintAllFramesTs;

	@JsonProperty("firstContentfulPaint")
	private Integer firstContentfulPaint;

	@JsonProperty("observedDomContentLoaded")
	private Integer observedDomContentLoaded;

	@JsonProperty("observedLoadTs")
	private Long observedLoadTs;

	@JsonProperty("observedTimeOriginTs")
	private Long observedTimeOriginTs;

	@JsonProperty("observedLoad")
	private Integer observedLoad;

	@JsonProperty("speedIndex")
	private Integer speedIndex;

	@JsonProperty("observedLargestContentfulPaintAllFrames")
	private Integer observedLargestContentfulPaintAllFrames;

	@JsonProperty("duration")
	private Object duration;

	@JsonProperty("startTime")
	private Object startTime;

	@JsonProperty("sessionTargetType")
	private String sessionTargetType;

	@JsonProperty("networkRequestTime")
	private Object networkRequestTime;

	@JsonProperty("finished")
	private Boolean finished;

	@JsonProperty("mimeType")
	private String mimeType;

	@JsonProperty("priority")
	private String priority;

	@JsonProperty("protocol")
	private String protocol;

	@JsonProperty("rendererStartTime")
	private Integer rendererStartTime;

	@JsonProperty("resourceSize")
	private Integer resourceSize;

	@JsonProperty("experimentalFromMainFrame")
	private Boolean experimentalFromMainFrame;

	@JsonProperty("networkEndTime")
	private Object networkEndTime;

	@JsonProperty("statusCode")
	private Integer statusCode;

	@JsonProperty("resourceType")
	private String resourceType;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("signal")
	private String signal;

	@JsonProperty("responseTime")
	private Object responseTime;

	@JsonProperty("sourceLocation")
	private SourceLocation sourceLocation;

	@JsonProperty("source")
	private Source source;

	@JsonProperty("headings")
	private List<HeadingsItem> headings;

	@JsonProperty("type")
	private String type;

	@JsonProperty("items")
	private List<ItemsItem> items;

	@JsonProperty("phase")
	private String phase;

	@JsonProperty("timing")
	private Object timing;

	@JsonProperty("percent")
	private String percent;

	@JsonProperty("numScripts")
	private Integer numScripts;

	@JsonProperty("numTasks")
	private Integer numTasks;

	@JsonProperty("maxRtt")
	private Object maxRtt;

	@JsonProperty("maxServerLatency")
	private Object maxServerLatency;

	@JsonProperty("numRequests")
	private Integer numRequests;

	@JsonProperty("numTasksOver100ms")
	private Integer numTasksOver100ms;

	@JsonProperty("numStylesheets")
	private Integer numStylesheets;

	@JsonProperty("numTasksOver50ms")
	private Integer numTasksOver50ms;

	@JsonProperty("numTasksOver10ms")
	private Integer numTasksOver10ms;

	@JsonProperty("mainDocumentTransferSize")
	private Integer mainDocumentTransferSize;

	@JsonProperty("numTasksOver25ms")
	private Integer numTasksOver25ms;

	@JsonProperty("numTasksOver500ms")
	private Integer numTasksOver500ms;

	@JsonProperty("numFonts")
	private Integer numFonts;

	@JsonProperty("totalTaskTime")
	private Object totalTaskTime;

	@JsonProperty("totalByteWeight")
	private Integer totalByteWeight;

	@JsonProperty("throughput")
	private Object throughput;

	@JsonProperty("failures")
	private List<String> failures;

	@JsonProperty("parseFailureReason")
	private String parseFailureReason;

	@JsonProperty("themeColor")
	private Object themeColor;

	@JsonProperty("isParseFailure")
	private Boolean isParseFailure;

	@JsonProperty("relatedNode")
	private RelatedNode relatedNode;

	@JsonProperty("size")
	private String size;

	@JsonProperty("tapTarget")
	private TapTarget tapTarget;

	@JsonProperty("overlapScoreRatio")
	private Object overlapScoreRatio;

	@JsonProperty("tapTargetScore")
	private Integer tapTargetScore;

	@JsonProperty("width")
	private Integer width;

	@JsonProperty("overlappingTarget")
	private OverlappingTarget overlappingTarget;

	@JsonProperty("overlappingTargetScore")
	private Object overlappingTargetScore;

	@JsonProperty("height")
	private Integer height;

	@JsonProperty("requestCount")
	private Integer requestCount;

	@JsonProperty("label")
	private String label;

	@JsonProperty("groupLabel")
	private String groupLabel;

	@JsonProperty("group")
	private String group;

	@JsonProperty("scripting")
	private Object scripting;

	@JsonProperty("total")
	private Object total;

	@JsonProperty("scriptParseCompile")
	private Object scriptParseCompile;

	@JsonProperty("name")
	private String name;

	@JsonProperty("npm")
	private String npm;

	@JsonProperty("version")
	private String version;

	@JsonProperty("coverage")
	private String coverage;

	@JsonProperty("selector")
	private String selector;

	@JsonProperty("fontSize")
	private String fontSize;

	@JsonProperty("statistic")
	private String statistic;

	@JsonProperty("value")
	private Value value;

	@JsonProperty("reason")
	private String reason;

	public void setWastedMs(Integer wastedMs){
		this.wastedMs = wastedMs;
	}

	public Integer getWastedMs(){
		return wastedMs;
	}

	public void setTotalBytes(Integer totalBytes){
		this.totalBytes = totalBytes;
	}

	public Integer getTotalBytes(){
		return totalBytes;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setWastedPercent(Object wastedPercent){
		this.wastedPercent = wastedPercent;
	}

	public Object getWastedPercent(){
		return wastedPercent;
	}

	public void setWastedBytes(Integer wastedBytes){
		this.wastedBytes = wastedBytes;
	}

	public Integer getWastedBytes(){
		return wastedBytes;
	}

	public void setScriptUrl(String scriptUrl){
		this.scriptUrl = scriptUrl;
	}

	public String getScriptUrl(){
		return scriptUrl;
	}

	public void setSubItems(SubItems subItems){
		this.subItems = subItems;
	}

	public SubItems getSubItems(){
		return subItems;
	}

	public void setError(String error){
		this.error = error;
	}

	public String getError(){
		return error;
	}

	public void setSeverity(String severity){
		this.severity = severity;
	}

	public String getSeverity(){
		return severity;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setDirective(String directive){
		this.directive = directive;
	}

	public String getDirective(){
		return directive;
	}

	public void setRtt(Object rtt){
		this.rtt = rtt;
	}

	public Object getRtt(){
		return rtt;
	}

	public void setOrigin(String origin){
		this.origin = origin;
	}

	public String getOrigin(){
		return origin;
	}

	public void setServerResponseTime(Object serverResponseTime){
		this.serverResponseTime = serverResponseTime;
	}

	public Object getServerResponseTime(){
		return serverResponseTime;
	}

	public void setNode(Node node){
		this.node = node;
	}

	public Node getNode(){
		return node;
	}

	public void setRequestStartTime(Object requestStartTime){
		this.requestStartTime = requestStartTime;
	}

	public Object getRequestStartTime(){
		return requestStartTime;
	}

	public void setTransferSize(Integer transferSize){
		this.transferSize = transferSize;
	}

	public Integer getTransferSize(){
		return transferSize;
	}

	public void setBlockingTime(Object blockingTime){
		this.blockingTime = blockingTime;
	}

	public Object getBlockingTime(){
		return blockingTime;
	}

	public void setTbtImpact(Object tbtImpact){
		this.tbtImpact = tbtImpact;
	}

	public Object getTbtImpact(){
		return tbtImpact;
	}

	public void setMainThreadTime(Object mainThreadTime){
		this.mainThreadTime = mainThreadTime;
	}

	public Object getMainThreadTime(){
		return mainThreadTime;
	}

	public void setEntity(String entity){
		this.entity = entity;
	}

	public String getEntity(){
		return entity;
	}

	public void setCacheLifetimeMs(Integer cacheLifetimeMs){
		this.cacheLifetimeMs = cacheLifetimeMs;
	}

	public Integer getCacheLifetimeMs(){
		return cacheLifetimeMs;
	}

	public void setCacheHitProbability(Integer cacheHitProbability){
		this.cacheHitProbability = cacheHitProbability;
	}

	public Integer getCacheHitProbability(){
		return cacheHitProbability;
	}

	public void setLine(String line){
		this.line = line;
	}

	public String getLine(){
		return line;
	}

	public void setIndex(String index){
		this.index = index;
	}

	public String getIndex(){
		return index;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setNewEngineResult(NewEngineResult newEngineResult){
		this.newEngineResult = newEngineResult;
	}

	public NewEngineResult getNewEngineResult(){
		return newEngineResult;
	}

	public void setNewEngineResultDiffered(Boolean newEngineResultDiffered){
		this.newEngineResultDiffered = newEngineResultDiffered;
	}

	public Boolean isNewEngineResultDiffered(){
		return newEngineResultDiffered;
	}

	public void setCumulativeLayoutShiftMainFrame(Integer cumulativeLayoutShiftMainFrame){
		this.cumulativeLayoutShiftMainFrame = cumulativeLayoutShiftMainFrame;
	}

	public Integer getCumulativeLayoutShiftMainFrame(){
		return cumulativeLayoutShiftMainFrame;
	}

	public void setLcpInvalidated(Boolean lcpInvalidated){
		this.lcpInvalidated = lcpInvalidated;
	}

	public Boolean isLcpInvalidated(){
		return lcpInvalidated;
	}

	public void setCumulativeLayoutShift(Integer cumulativeLayoutShift){
		this.cumulativeLayoutShift = cumulativeLayoutShift;
	}

	public Integer getCumulativeLayoutShift(){
		return cumulativeLayoutShift;
	}

	public void setObservedLargestContentfulPaintTs(Long observedLargestContentfulPaintTs){
		this.observedLargestContentfulPaintTs = observedLargestContentfulPaintTs;
	}

	public Long getObservedLargestContentfulPaintTs(){
		return observedLargestContentfulPaintTs;
	}

	public void setLcpLoadEnd(Integer lcpLoadEnd){
		this.lcpLoadEnd = lcpLoadEnd;
	}

	public Integer getLcpLoadEnd(){
		return lcpLoadEnd;
	}

	public void setInteractive(Integer interactive){
		this.interactive = interactive;
	}

	public Integer getInteractive(){
		return interactive;
	}

	public void setObservedDomContentLoadedTs(Long observedDomContentLoadedTs){
		this.observedDomContentLoadedTs = observedDomContentLoadedTs;
	}

	public Long getObservedDomContentLoadedTs(){
		return observedDomContentLoadedTs;
	}

	public void setObservedCumulativeLayoutShiftMainFrame(Integer observedCumulativeLayoutShiftMainFrame){
		this.observedCumulativeLayoutShiftMainFrame = observedCumulativeLayoutShiftMainFrame;
	}

	public Integer getObservedCumulativeLayoutShiftMainFrame(){
		return observedCumulativeLayoutShiftMainFrame;
	}

	public void setObservedNavigationStart(Integer observedNavigationStart){
		this.observedNavigationStart = observedNavigationStart;
	}

	public Integer getObservedNavigationStart(){
		return observedNavigationStart;
	}

	public void setObservedSpeedIndex(Integer observedSpeedIndex){
		this.observedSpeedIndex = observedSpeedIndex;
	}

	public Integer getObservedSpeedIndex(){
		return observedSpeedIndex;
	}

	public void setObservedSpeedIndexTs(Long observedSpeedIndexTs){
		this.observedSpeedIndexTs = observedSpeedIndexTs;
	}

	public Long getObservedSpeedIndexTs(){
		return observedSpeedIndexTs;
	}

	public void setObservedFirstContentfulPaintTs(Long observedFirstContentfulPaintTs){
		this.observedFirstContentfulPaintTs = observedFirstContentfulPaintTs;
	}

	public Long getObservedFirstContentfulPaintTs(){
		return observedFirstContentfulPaintTs;
	}

	public void setObservedFirstContentfulPaintAllFramesTs(Long observedFirstContentfulPaintAllFramesTs){
		this.observedFirstContentfulPaintAllFramesTs = observedFirstContentfulPaintAllFramesTs;
	}

	public Long getObservedFirstContentfulPaintAllFramesTs(){
		return observedFirstContentfulPaintAllFramesTs;
	}

	public void setObservedFirstVisualChange(Integer observedFirstVisualChange){
		this.observedFirstVisualChange = observedFirstVisualChange;
	}

	public Integer getObservedFirstVisualChange(){
		return observedFirstVisualChange;
	}

	public void setObservedLastVisualChange(Integer observedLastVisualChange){
		this.observedLastVisualChange = observedLastVisualChange;
	}

	public Integer getObservedLastVisualChange(){
		return observedLastVisualChange;
	}

	public void setObservedFirstContentfulPaint(Integer observedFirstContentfulPaint){
		this.observedFirstContentfulPaint = observedFirstContentfulPaint;
	}

	public Integer getObservedFirstContentfulPaint(){
		return observedFirstContentfulPaint;
	}

	public void setTotalBlockingTime(Integer totalBlockingTime){
		this.totalBlockingTime = totalBlockingTime;
	}

	public Integer getTotalBlockingTime(){
		return totalBlockingTime;
	}

	public void setMaxPotentialFID(Integer maxPotentialFID){
		this.maxPotentialFID = maxPotentialFID;
	}

	public Integer getMaxPotentialFID(){
		return maxPotentialFID;
	}

	public void setObservedNavigationStartTs(Long observedNavigationStartTs){
		this.observedNavigationStartTs = observedNavigationStartTs;
	}

	public Long getObservedNavigationStartTs(){
		return observedNavigationStartTs;
	}

	public void setObservedLargestContentfulPaint(Integer observedLargestContentfulPaint){
		this.observedLargestContentfulPaint = observedLargestContentfulPaint;
	}

	public Integer getObservedLargestContentfulPaint(){
		return observedLargestContentfulPaint;
	}

	public void setObservedFirstPaintTs(Long observedFirstPaintTs){
		this.observedFirstPaintTs = observedFirstPaintTs;
	}

	public Long getObservedFirstPaintTs(){
		return observedFirstPaintTs;
	}

	public void setObservedFirstMeaningfulPaintTs(Long observedFirstMeaningfulPaintTs){
		this.observedFirstMeaningfulPaintTs = observedFirstMeaningfulPaintTs;
	}

	public Long getObservedFirstMeaningfulPaintTs(){
		return observedFirstMeaningfulPaintTs;
	}

	public void setObservedCumulativeLayoutShift(Integer observedCumulativeLayoutShift){
		this.observedCumulativeLayoutShift = observedCumulativeLayoutShift;
	}

	public Integer getObservedCumulativeLayoutShift(){
		return observedCumulativeLayoutShift;
	}

	public void setObservedLastVisualChangeTs(Long observedLastVisualChangeTs){
		this.observedLastVisualChangeTs = observedLastVisualChangeTs;
	}

	public Long getObservedLastVisualChangeTs(){
		return observedLastVisualChangeTs;
	}

	public void setObservedTimeOrigin(Integer observedTimeOrigin){
		this.observedTimeOrigin = observedTimeOrigin;
	}

	public Integer getObservedTimeOrigin(){
		return observedTimeOrigin;
	}

	public void setObservedFirstVisualChangeTs(Long observedFirstVisualChangeTs){
		this.observedFirstVisualChangeTs = observedFirstVisualChangeTs;
	}

	public Long getObservedFirstVisualChangeTs(){
		return observedFirstVisualChangeTs;
	}

	public void setObservedFirstPaint(Integer observedFirstPaint){
		this.observedFirstPaint = observedFirstPaint;
	}

	public Integer getObservedFirstPaint(){
		return observedFirstPaint;
	}

	public void setLcpLoadStart(Integer lcpLoadStart){
		this.lcpLoadStart = lcpLoadStart;
	}

	public Integer getLcpLoadStart(){
		return lcpLoadStart;
	}

	public void setObservedTraceEnd(Integer observedTraceEnd){
		this.observedTraceEnd = observedTraceEnd;
	}

	public Integer getObservedTraceEnd(){
		return observedTraceEnd;
	}

	public void setObservedFirstContentfulPaintAllFrames(Integer observedFirstContentfulPaintAllFrames){
		this.observedFirstContentfulPaintAllFrames = observedFirstContentfulPaintAllFrames;
	}

	public Integer getObservedFirstContentfulPaintAllFrames(){
		return observedFirstContentfulPaintAllFrames;
	}

	public void setFirstMeaningfulPaint(Integer firstMeaningfulPaint){
		this.firstMeaningfulPaint = firstMeaningfulPaint;
	}

	public Integer getFirstMeaningfulPaint(){
		return firstMeaningfulPaint;
	}

	public void setObservedTraceEndTs(Long observedTraceEndTs){
		this.observedTraceEndTs = observedTraceEndTs;
	}

	public Long getObservedTraceEndTs(){
		return observedTraceEndTs;
	}

	public void setObservedFirstMeaningfulPaint(Integer observedFirstMeaningfulPaint){
		this.observedFirstMeaningfulPaint = observedFirstMeaningfulPaint;
	}

	public Integer getObservedFirstMeaningfulPaint(){
		return observedFirstMeaningfulPaint;
	}

	public void setLargestContentfulPaint(Integer largestContentfulPaint){
		this.largestContentfulPaint = largestContentfulPaint;
	}

	public Integer getLargestContentfulPaint(){
		return largestContentfulPaint;
	}

	public void setTimeToFirstByte(Integer timeToFirstByte){
		this.timeToFirstByte = timeToFirstByte;
	}

	public Integer getTimeToFirstByte(){
		return timeToFirstByte;
	}

	public void setObservedLargestContentfulPaintAllFramesTs(Long observedLargestContentfulPaintAllFramesTs){
		this.observedLargestContentfulPaintAllFramesTs = observedLargestContentfulPaintAllFramesTs;
	}

	public Long getObservedLargestContentfulPaintAllFramesTs(){
		return observedLargestContentfulPaintAllFramesTs;
	}

	public void setFirstContentfulPaint(Integer firstContentfulPaint){
		this.firstContentfulPaint = firstContentfulPaint;
	}

	public Integer getFirstContentfulPaint(){
		return firstContentfulPaint;
	}

	public void setObservedDomContentLoaded(Integer observedDomContentLoaded){
		this.observedDomContentLoaded = observedDomContentLoaded;
	}

	public Integer getObservedDomContentLoaded(){
		return observedDomContentLoaded;
	}

	public void setObservedLoadTs(Long observedLoadTs){
		this.observedLoadTs = observedLoadTs;
	}

	public Long getObservedLoadTs(){
		return observedLoadTs;
	}

	public void setObservedTimeOriginTs(Long observedTimeOriginTs){
		this.observedTimeOriginTs = observedTimeOriginTs;
	}

	public Long getObservedTimeOriginTs(){
		return observedTimeOriginTs;
	}

	public void setObservedLoad(Integer observedLoad){
		this.observedLoad = observedLoad;
	}

	public Integer getObservedLoad(){
		return observedLoad;
	}

	public void setSpeedIndex(Integer speedIndex){
		this.speedIndex = speedIndex;
	}

	public Integer getSpeedIndex(){
		return speedIndex;
	}

	public void setObservedLargestContentfulPaintAllFrames(Integer observedLargestContentfulPaintAllFrames){
		this.observedLargestContentfulPaintAllFrames = observedLargestContentfulPaintAllFrames;
	}

	public Integer getObservedLargestContentfulPaintAllFrames(){
		return observedLargestContentfulPaintAllFrames;
	}

	public void setDuration(Object duration){
		this.duration = duration;
	}

	public Object getDuration(){
		return duration;
	}

	public void setStartTime(Object startTime){
		this.startTime = startTime;
	}

	public Object getStartTime(){
		return startTime;
	}

	public void setSessionTargetType(String sessionTargetType){
		this.sessionTargetType = sessionTargetType;
	}

	public String getSessionTargetType(){
		return sessionTargetType;
	}

	public void setNetworkRequestTime(Object networkRequestTime){
		this.networkRequestTime = networkRequestTime;
	}

	public Object getNetworkRequestTime(){
		return networkRequestTime;
	}

	public void setFinished(Boolean finished){
		this.finished = finished;
	}

	public Boolean isFinished(){
		return finished;
	}

	public void setMimeType(String mimeType){
		this.mimeType = mimeType;
	}

	public String getMimeType(){
		return mimeType;
	}

	public void setPriority(String priority){
		this.priority = priority;
	}

	public String getPriority(){
		return priority;
	}

	public void setProtocol(String protocol){
		this.protocol = protocol;
	}

	public String getProtocol(){
		return protocol;
	}

	public void setRendererStartTime(Integer rendererStartTime){
		this.rendererStartTime = rendererStartTime;
	}

	public Integer getRendererStartTime(){
		return rendererStartTime;
	}

	public void setResourceSize(Integer resourceSize){
		this.resourceSize = resourceSize;
	}

	public Integer getResourceSize(){
		return resourceSize;
	}

	public void setExperimentalFromMainFrame(Boolean experimentalFromMainFrame){
		this.experimentalFromMainFrame = experimentalFromMainFrame;
	}

	public Boolean isExperimentalFromMainFrame(){
		return experimentalFromMainFrame;
	}

	public void setNetworkEndTime(Object networkEndTime){
		this.networkEndTime = networkEndTime;
	}

	public Object getNetworkEndTime(){
		return networkEndTime;
	}

	public void setStatusCode(Integer statusCode){
		this.statusCode = statusCode;
	}

	public Integer getStatusCode(){
		return statusCode;
	}

	public void setResourceType(String resourceType){
		this.resourceType = resourceType;
	}

	public String getResourceType(){
		return resourceType;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	public void setSignal(String signal){
		this.signal = signal;
	}

	public String getSignal(){
		return signal;
	}

	public void setResponseTime(Object responseTime){
		this.responseTime = responseTime;
	}

	public Object getResponseTime(){
		return responseTime;
	}

	public void setSourceLocation(SourceLocation sourceLocation){
		this.sourceLocation = sourceLocation;
	}

	public SourceLocation getSourceLocation(){
		return sourceLocation;
	}

	public void setSource(Source source){
		this.source = source;
	}

	public Source getSource(){
		return source;
	}

	public void setHeadings(List<HeadingsItem> headings){
		this.headings = headings;
	}

	public List<HeadingsItem> getHeadings(){
		return headings;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	public void setPhase(String phase){
		this.phase = phase;
	}

	public String getPhase(){
		return phase;
	}

	public void setTiming(Object timing){
		this.timing = timing;
	}

	public Object getTiming(){
		return timing;
	}

	public void setPercent(String percent){
		this.percent = percent;
	}

	public String getPercent(){
		return percent;
	}

	public void setNumScripts(Integer numScripts){
		this.numScripts = numScripts;
	}

	public Integer getNumScripts(){
		return numScripts;
	}

	public void setNumTasks(Integer numTasks){
		this.numTasks = numTasks;
	}

	public Integer getNumTasks(){
		return numTasks;
	}

	public void setMaxRtt(Object maxRtt){
		this.maxRtt = maxRtt;
	}

	public Object getMaxRtt(){
		return maxRtt;
	}

	public void setMaxServerLatency(Object maxServerLatency){
		this.maxServerLatency = maxServerLatency;
	}

	public Object getMaxServerLatency(){
		return maxServerLatency;
	}

	public void setNumRequests(Integer numRequests){
		this.numRequests = numRequests;
	}

	public Integer getNumRequests(){
		return numRequests;
	}

	public void setNumTasksOver100ms(Integer numTasksOver100ms){
		this.numTasksOver100ms = numTasksOver100ms;
	}

	public Integer getNumTasksOver100ms(){
		return numTasksOver100ms;
	}

	public void setNumStylesheets(Integer numStylesheets){
		this.numStylesheets = numStylesheets;
	}

	public Integer getNumStylesheets(){
		return numStylesheets;
	}

	public void setNumTasksOver50ms(Integer numTasksOver50ms){
		this.numTasksOver50ms = numTasksOver50ms;
	}

	public Integer getNumTasksOver50ms(){
		return numTasksOver50ms;
	}

	public void setNumTasksOver10ms(Integer numTasksOver10ms){
		this.numTasksOver10ms = numTasksOver10ms;
	}

	public Integer getNumTasksOver10ms(){
		return numTasksOver10ms;
	}

	public void setMainDocumentTransferSize(Integer mainDocumentTransferSize){
		this.mainDocumentTransferSize = mainDocumentTransferSize;
	}

	public Integer getMainDocumentTransferSize(){
		return mainDocumentTransferSize;
	}

	public void setNumTasksOver25ms(Integer numTasksOver25ms){
		this.numTasksOver25ms = numTasksOver25ms;
	}

	public Integer getNumTasksOver25ms(){
		return numTasksOver25ms;
	}

	public void setNumTasksOver500ms(Integer numTasksOver500ms){
		this.numTasksOver500ms = numTasksOver500ms;
	}

	public Integer getNumTasksOver500ms(){
		return numTasksOver500ms;
	}

	public void setNumFonts(Integer numFonts){
		this.numFonts = numFonts;
	}

	public Integer getNumFonts(){
		return numFonts;
	}

	public void setTotalTaskTime(Object totalTaskTime){
		this.totalTaskTime = totalTaskTime;
	}

	public Object getTotalTaskTime(){
		return totalTaskTime;
	}

	public void setTotalByteWeight(Integer totalByteWeight){
		this.totalByteWeight = totalByteWeight;
	}

	public Integer getTotalByteWeight(){
		return totalByteWeight;
	}

	public void setThroughput(Object throughput){
		this.throughput = throughput;
	}

	public Object getThroughput(){
		return throughput;
	}

	public void setFailures(List<String> failures){
		this.failures = failures;
	}

	public List<String> getFailures(){
		return failures;
	}

	public void setParseFailureReason(String parseFailureReason){
		this.parseFailureReason = parseFailureReason;
	}

	public String getParseFailureReason(){
		return parseFailureReason;
	}

	public void setThemeColor(Object themeColor){
		this.themeColor = themeColor;
	}

	public Object getThemeColor(){
		return themeColor;
	}

	public void setIsParseFailure(Boolean isParseFailure){
		this.isParseFailure = isParseFailure;
	}

	public Boolean isIsParseFailure(){
		return isParseFailure;
	}

	public void setRelatedNode(RelatedNode relatedNode){
		this.relatedNode = relatedNode;
	}

	public RelatedNode getRelatedNode(){
		return relatedNode;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setTapTarget(TapTarget tapTarget){
		this.tapTarget = tapTarget;
	}

	public TapTarget getTapTarget(){
		return tapTarget;
	}

	public void setOverlapScoreRatio(Object overlapScoreRatio){
		this.overlapScoreRatio = overlapScoreRatio;
	}

	public Object getOverlapScoreRatio(){
		return overlapScoreRatio;
	}

	public void setTapTargetScore(Integer tapTargetScore){
		this.tapTargetScore = tapTargetScore;
	}

	public Integer getTapTargetScore(){
		return tapTargetScore;
	}

	public void setWidth(Integer width){
		this.width = width;
	}

	public Integer getWidth(){
		return width;
	}

	public void setOverlappingTarget(OverlappingTarget overlappingTarget){
		this.overlappingTarget = overlappingTarget;
	}

	public OverlappingTarget getOverlappingTarget(){
		return overlappingTarget;
	}

	public void setOverlappingTargetScore(Object overlappingTargetScore){
		this.overlappingTargetScore = overlappingTargetScore;
	}

	public Object getOverlappingTargetScore(){
		return overlappingTargetScore;
	}

	public void setHeight(Integer height){
		this.height = height;
	}

	public Integer getHeight(){
		return height;
	}

	public void setRequestCount(Integer requestCount){
		this.requestCount = requestCount;
	}

	public Integer getRequestCount(){
		return requestCount;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setGroupLabel(String groupLabel){
		this.groupLabel = groupLabel;
	}

	public String getGroupLabel(){
		return groupLabel;
	}

	public void setGroup(String group){
		this.group = group;
	}

	public String getGroup(){
		return group;
	}

	public void setScripting(Object scripting){
		this.scripting = scripting;
	}

	public Object getScripting(){
		return scripting;
	}

	public void setTotal(Object total){
		this.total = total;
	}

	public Object getTotal(){
		return total;
	}

	public void setScriptParseCompile(Object scriptParseCompile){
		this.scriptParseCompile = scriptParseCompile;
	}

	public Object getScriptParseCompile(){
		return scriptParseCompile;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setNpm(String npm){
		this.npm = npm;
	}

	public String getNpm(){
		return npm;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	public void setCoverage(String coverage){
		this.coverage = coverage;
	}

	public String getCoverage(){
		return coverage;
	}

	public void setSelector(String selector){
		this.selector = selector;
	}

	public String getSelector(){
		return selector;
	}

	public void setFontSize(String fontSize){
		this.fontSize = fontSize;
	}

	public String getFontSize(){
		return fontSize;
	}

	public void setStatistic(String statistic){
		this.statistic = statistic;
	}

	public String getStatistic(){
		return statistic;
	}

	public void setValue(Value value){
		this.value = value;
	}

	public Value getValue(){
		return value;
	}

	public void setReason(String reason){
		this.reason = reason;
	}

	public String getReason(){
		return reason;
	}

	@Override
 	public String toString(){
		return 
			"ItemsItem{" + 
			"wastedMs = '" + wastedMs + '\'' + 
			",totalBytes = '" + totalBytes + '\'' + 
			",url = '" + url + '\'' + 
			",wastedPercent = '" + wastedPercent + '\'' + 
			",wastedBytes = '" + wastedBytes + '\'' + 
			",scriptUrl = '" + scriptUrl + '\'' + 
			",subItems = '" + subItems + '\'' + 
			",error = '" + error + '\'' + 
			",severity = '" + severity + '\'' + 
			",description = '" + description + '\'' + 
			",directive = '" + directive + '\'' + 
			",rtt = '" + rtt + '\'' + 
			",origin = '" + origin + '\'' + 
			",serverResponseTime = '" + serverResponseTime + '\'' + 
			",node = '" + node + '\'' + 
			",requestStartTime = '" + requestStartTime + '\'' + 
			",transferSize = '" + transferSize + '\'' + 
			",blockingTime = '" + blockingTime + '\'' + 
			",tbtImpact = '" + tbtImpact + '\'' + 
			",mainThreadTime = '" + mainThreadTime + '\'' + 
			",entity = '" + entity + '\'' + 
			",cacheLifetimeMs = '" + cacheLifetimeMs + '\'' + 
			",cacheHitProbability = '" + cacheHitProbability + '\'' + 
			",line = '" + line + '\'' + 
			",index = '" + index + '\'' + 
			",message = '" + message + '\'' + 
			",newEngineResult = '" + newEngineResult + '\'' + 
			",newEngineResultDiffered = '" + newEngineResultDiffered + '\'' + 
			",cumulativeLayoutShiftMainFrame = '" + cumulativeLayoutShiftMainFrame + '\'' + 
			",lcpInvalidated = '" + lcpInvalidated + '\'' + 
			",cumulativeLayoutShift = '" + cumulativeLayoutShift + '\'' + 
			",observedLargestContentfulPaintTs = '" + observedLargestContentfulPaintTs + '\'' + 
			",lcpLoadEnd = '" + lcpLoadEnd + '\'' + 
			",interactive = '" + interactive + '\'' + 
			",observedDomContentLoadedTs = '" + observedDomContentLoadedTs + '\'' + 
			",observedCumulativeLayoutShiftMainFrame = '" + observedCumulativeLayoutShiftMainFrame + '\'' + 
			",observedNavigationStart = '" + observedNavigationStart + '\'' + 
			",observedSpeedIndex = '" + observedSpeedIndex + '\'' + 
			",observedSpeedIndexTs = '" + observedSpeedIndexTs + '\'' + 
			",observedFirstContentfulPaintTs = '" + observedFirstContentfulPaintTs + '\'' + 
			",observedFirstContentfulPaintAllFramesTs = '" + observedFirstContentfulPaintAllFramesTs + '\'' + 
			",observedFirstVisualChange = '" + observedFirstVisualChange + '\'' + 
			",observedLastVisualChange = '" + observedLastVisualChange + '\'' + 
			",observedFirstContentfulPaint = '" + observedFirstContentfulPaint + '\'' + 
			",totalBlockingTime = '" + totalBlockingTime + '\'' + 
			",maxPotentialFID = '" + maxPotentialFID + '\'' + 
			",observedNavigationStartTs = '" + observedNavigationStartTs + '\'' + 
			",observedLargestContentfulPaint = '" + observedLargestContentfulPaint + '\'' + 
			",observedFirstPaintTs = '" + observedFirstPaintTs + '\'' + 
			",observedFirstMeaningfulPaintTs = '" + observedFirstMeaningfulPaintTs + '\'' + 
			",observedCumulativeLayoutShift = '" + observedCumulativeLayoutShift + '\'' + 
			",observedLastVisualChangeTs = '" + observedLastVisualChangeTs + '\'' + 
			",observedTimeOrigin = '" + observedTimeOrigin + '\'' + 
			",observedFirstVisualChangeTs = '" + observedFirstVisualChangeTs + '\'' + 
			",observedFirstPaint = '" + observedFirstPaint + '\'' + 
			",lcpLoadStart = '" + lcpLoadStart + '\'' + 
			",observedTraceEnd = '" + observedTraceEnd + '\'' + 
			",observedFirstContentfulPaintAllFrames = '" + observedFirstContentfulPaintAllFrames + '\'' + 
			",firstMeaningfulPaint = '" + firstMeaningfulPaint + '\'' + 
			",observedTraceEndTs = '" + observedTraceEndTs + '\'' + 
			",observedFirstMeaningfulPaint = '" + observedFirstMeaningfulPaint + '\'' + 
			",largestContentfulPaint = '" + largestContentfulPaint + '\'' + 
			",timeToFirstByte = '" + timeToFirstByte + '\'' + 
			",observedLargestContentfulPaintAllFramesTs = '" + observedLargestContentfulPaintAllFramesTs + '\'' + 
			",firstContentfulPaint = '" + firstContentfulPaint + '\'' + 
			",observedDomContentLoaded = '" + observedDomContentLoaded + '\'' + 
			",observedLoadTs = '" + observedLoadTs + '\'' + 
			",observedTimeOriginTs = '" + observedTimeOriginTs + '\'' + 
			",observedLoad = '" + observedLoad + '\'' + 
			",speedIndex = '" + speedIndex + '\'' + 
			",observedLargestContentfulPaintAllFrames = '" + observedLargestContentfulPaintAllFrames + '\'' + 
			",duration = '" + duration + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",sessionTargetType = '" + sessionTargetType + '\'' + 
			",networkRequestTime = '" + networkRequestTime + '\'' + 
			",finished = '" + finished + '\'' + 
			",mimeType = '" + mimeType + '\'' + 
			",priority = '" + priority + '\'' + 
			",protocol = '" + protocol + '\'' + 
			",rendererStartTime = '" + rendererStartTime + '\'' + 
			",resourceSize = '" + resourceSize + '\'' + 
			",experimentalFromMainFrame = '" + experimentalFromMainFrame + '\'' + 
			",networkEndTime = '" + networkEndTime + '\'' + 
			",statusCode = '" + statusCode + '\'' + 
			",resourceType = '" + resourceType + '\'' + 
			",location = '" + location + '\'' + 
			",signal = '" + signal + '\'' + 
			",responseTime = '" + responseTime + '\'' + 
			",sourceLocation = '" + sourceLocation + '\'' + 
			",source = '" + source + '\'' + 
			",headings = '" + headings + '\'' + 
			",type = '" + type + '\'' + 
			",items = '" + items + '\'' + 
			",phase = '" + phase + '\'' + 
			",timing = '" + timing + '\'' + 
			",percent = '" + percent + '\'' + 
			",numScripts = '" + numScripts + '\'' + 
			",numTasks = '" + numTasks + '\'' + 
			",maxRtt = '" + maxRtt + '\'' + 
			",maxServerLatency = '" + maxServerLatency + '\'' + 
			",numRequests = '" + numRequests + '\'' + 
			",numTasksOver100ms = '" + numTasksOver100ms + '\'' + 
			",numStylesheets = '" + numStylesheets + '\'' + 
			",numTasksOver50ms = '" + numTasksOver50ms + '\'' + 
			",numTasksOver10ms = '" + numTasksOver10ms + '\'' + 
			",mainDocumentTransferSize = '" + mainDocumentTransferSize + '\'' + 
			",numTasksOver25ms = '" + numTasksOver25ms + '\'' + 
			",numTasksOver500ms = '" + numTasksOver500ms + '\'' + 
			",numFonts = '" + numFonts + '\'' + 
			",totalTaskTime = '" + totalTaskTime + '\'' + 
			",totalByteWeight = '" + totalByteWeight + '\'' + 
			",throughput = '" + throughput + '\'' + 
			",failures = '" + failures + '\'' + 
			",parseFailureReason = '" + parseFailureReason + '\'' + 
			",themeColor = '" + themeColor + '\'' + 
			",isParseFailure = '" + isParseFailure + '\'' + 
			",relatedNode = '" + relatedNode + '\'' + 
			",size = '" + size + '\'' + 
			",tapTarget = '" + tapTarget + '\'' + 
			",overlapScoreRatio = '" + overlapScoreRatio + '\'' + 
			",tapTargetScore = '" + tapTargetScore + '\'' + 
			",width = '" + width + '\'' + 
			",overlappingTarget = '" + overlappingTarget + '\'' + 
			",overlappingTargetScore = '" + overlappingTargetScore + '\'' + 
			",height = '" + height + '\'' + 
			",requestCount = '" + requestCount + '\'' + 
			",label = '" + label + '\'' + 
			",groupLabel = '" + groupLabel + '\'' + 
			",group = '" + group + '\'' + 
			",scripting = '" + scripting + '\'' + 
			",total = '" + total + '\'' + 
			",scriptParseCompile = '" + scriptParseCompile + '\'' + 
			",name = '" + name + '\'' + 
			",npm = '" + npm + '\'' + 
			",version = '" + version + '\'' + 
			",coverage = '" + coverage + '\'' + 
			",selector = '" + selector + '\'' + 
			",fontSize = '" + fontSize + '\'' + 
			",statistic = '" + statistic + '\'' + 
			",value = '" + value + '\'' + 
			",reason = '" + reason + '\'' + 
			"}";
		}
}