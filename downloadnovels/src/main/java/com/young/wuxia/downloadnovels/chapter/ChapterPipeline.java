package com.young.wuxia.downloadnovels.chapter;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

/**
 * Created by bin.yao on 2017/4/20.
 */
@PipelineName("chapterPipeline")
public class ChapterPipeline implements Pipeline<Chapter>{

    @Override
    public void process(Chapter chapter) {
        String body = chapter.getBody();
        System.out.println(body);
    }
}
