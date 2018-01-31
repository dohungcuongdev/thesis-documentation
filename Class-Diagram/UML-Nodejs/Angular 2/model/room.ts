
import * as AppConst from '../constant/app.const'

export class Room {
    constructor(name: string, size: number, price: number, numpeople: number, status: string, img: string, img2: string, type: string, details: string, amenities: string, booked_by: string, checkin: Date, checkout: Date, star: number)

    id: string
    name: string
    size: number
    price: number
    numpeople: number
    status: string
    img: string
    img2: string
    type: string
    details: string
    amenities: string
    booked_by: string
    checkin: Date
    checkout: Date
    imgwithURL: string
    imgwithURL2: string
    star: number
    numvote: number
    average_star: number
}