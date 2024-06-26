package controller;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class InternationalizationConfig extends WebMvcConfigurerAdapter {

//Create a SessionLocaleResolver object and set the default locale to English  return the SessionLocaleResolver object  
	@Bean
   public LocaleResolver localeResolver() {
		 SessionLocaleResolver obj = new SessionLocaleResolver();
        obj.setDefaultLocale(Locale.US);
        return  obj;
   }
   
   //Create LocaleChangeInterceptor object and set the parameter name as language and return the localeChangeInterceptor
   @Bean
   public LocaleChangeInterceptor localeChangeInterceptor() {
	   LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("language");
        return localeChangeInterceptor;
 

   }
   
   
   //register the LocaleChangeInterceptor
   @Override
   public void addInterceptors(InterceptorRegistry registry) {
	   registry.addInterceptor(localeChangeInterceptor());
      
   }
}