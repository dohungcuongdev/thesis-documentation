
import * as AppConst from '../constant/app.const';  //use constant


export default class ApiService<T> { // no need to import from app module

 # apiUrl: string
 # http: Http


 + constructor(injector: Injector) 

 # getAll(): Observable<any[]> 

 # get(id): Observable<any> 

 # getAllFromURL(specialURL): Observable<any[]> 

 # getAllby(value, specialURL): Observable<any[]> 

 # add(obj): Observable<Response> 

 # remove(id): Observable<Response> 

 # edit(id, obj): Observable<Response> 

}