package com.dnslin.common.core.exception.file;

import com.dnslin.common.core.exception.base.BaseException;

/**
 * 文件信息异常类
 * 
 * @author DnsLin
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
