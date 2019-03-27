package com.oocl.ita.gallery.file.service.file;

import com.oocl.ita.gallery.common.model.BaseService;
import com.oocl.ita.gallery.common.model.ImageFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Justin Liu on 3/26/2019.
 */
@Service
public class FileService extends BaseService<ImageFile, String> {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileService.class);

    @Autowired
    private FileRepository fileRepository;


    @Override
    public PagingAndSortingRepository<ImageFile, String> getRepository() {
        return this.fileRepository;
    }
}
