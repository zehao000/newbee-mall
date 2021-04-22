
  package ltd.newbee.mall.controller.mall;
  
  import static org.junit.Assert.assertEquals;
  
  
  
  
  import java.util.List; import javax.annotation.Resource;
  
  import org.junit.jupiter.api.Test;
  
  
  import ltd.newbee.mall.entity.GoodsDesc; import
  ltd.newbee.mall.entity.GoodsImage; import ltd.newbee.mall.entity.GoodsQa;
  import ltd.newbee.mall.entity.GoodsReview; import
  ltd.newbee.mall.service.NewBeeMallGoodsService; import
  org.springframework.boot.test.context.SpringBootTest;
  
  @SpringBootTest public class GoodsControllerTest extends GoodsController {
  
  @Resource NewBeeMallGoodsService newBeeMallGoodsService;
  
  @Test public void testGoodsDescService() { long goodsId =21L; List<GoodsDesc>
  goodsDesc = newBeeMallGoodsService.getGoodsDescEntityByGoodsId(goodsId); 
  GoodsDesc 
  desc =goodsDesc.get(0);  }
  
  @Test public void testGoodsImageService() { long goodsId =10700L; List<GoodsImage>
  GoodsImage = newBeeMallGoodsService.getGoodsImageEntityByGoodsId(goodsId);
  GoodsImage image
  =GoodsImage.get(0);}
 
  
  @Test public void testGoodsQaService() { long goodsId =999L; List<GoodsQa>
  goodsQa = newBeeMallGoodsService.getGoodsQaEntityByGoodsId(goodsId);
  GoodsQa qa =
  goodsQa.get(0); String answer = qa.getAnswer(); assertEquals("WW",answer);
  
  }
  
  @Test public void testGoodsReview() { long goodsId =10003; List<GoodsReview>
  goodsReviewList = newBeeMallGoodsService.getGoodsReviewEntityByGoodsId(goodsId); 
  GoodsReview
  review = goodsReviewList.get(0); String title = review.getTitle();
  assertEquals("fff",title);
  
  
  
  }
  
  }
 