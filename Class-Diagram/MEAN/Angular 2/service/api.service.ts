
import * as AppConst from '../constant/app.const';  //use constant


export default class ApiService<T> { // no need to import from app module

    protected apiUrl: string
    protected http: Http


    constructor(injector: Injector) 

    protected getAll(): Observable<any[]> 

    protected get(id): Observable<any> 

    protected getAllFromURL(specialURL): Observable<any[]> 

    protected getAllby(value, specialURL): Observable<any[]> 

    protected add(obj): Observable<Response> 

    protected remove(id): Observable<Response> 

    protected edit(id, obj): Observable<Response> 

}