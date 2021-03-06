package com.dnslin.system.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import com.dnslin.common.core.constant.ServiceNameConstants;
import com.dnslin.common.core.domain.R;
import com.dnslin.system.api.domain.SysFile;
import com.dnslin.system.api.factory.RemoteFileFallbackFactory;

/**
 * 文件服务
 *
 * @author DnsLin
 */
@FeignClient(contextId = "remoteFileService", value = ServiceNameConstants.FILE_SERVICE, fallbackFactory = RemoteFileFallbackFactory.class)
public interface RemoteFileService {
    /**
     * 上传文件
     *
     * @param file 文件信息
     * @return R<SysFile>
     */
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    R<SysFile> upload(@RequestPart(value = "file") MultipartFile file);
}
