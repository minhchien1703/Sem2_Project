

function ProductDetails() {
    return (
        <>
            <div className="wrapper">
                <main className="main-content">
                    {/*== Start Page Header Area Wrapper ==*/}
                    <div className="page-header-area">
                        <div
                            className="page-header-content bg-img"
                            data-bg-img="assets/images/photos/bg1.jpg"
                        >
                            <ol className="breadcrumb">
                                <li className="breadcrumb-item">
                                    <a href="index.html">Home</a>
                                </li>
                                <li className="breadcrumb-item active" aria-current="page">
                                    Product Details
                                </li>
                            </ol>
                        </div>
                    </div>
                    {/*== End Page Header Area Wrapper ==*/}
                    {/*== Start Product Detail Area Wrapper ==*/}
                    <div className="product-details-section section-space">
                        <div className="container">
                            {/* Single Product Top Area Start */}
                            <div className="row row-cols-md-2 row-cols-1 mb-n6">
                                {/* Product Image Start */}
                                <div className="col mb-4">
                                    <div className="single-product-image">
                                        {/* Product Image Slider Start */}
                                        <div className="product-image-slider swiper">
                                            {/* Product Badge Start */}
                                            <div className="single-product-badge-left">
                                                <span className="single-product-badge-new">new</span>
                                            </div>
                                            <div className="single-product-badge-right">
                                                <span className="single-product-badge-sale">sale</span>
                                                <span className="single-product-badge-sale">-11%</span>
                                            </div>
                                            {/* Product Badge End */}
                                            <div className="swiper-wrapper">
                                                <div className="swiper-slide image-zoom">
                                                    <img
                                                        src="assets/images/shop/details/single-product-1.jpg"
                                                        width={600}
                                                        height={700}
                                                        alt="Image-HasTech"
                                                    />
                                                </div>
                                                <div className="swiper-slide image-zoom">
                                                    <img
                                                        src="assets/images/shop/details/single-product-2.jpg"
                                                        width={600}
                                                        height={700}
                                                        alt="Image-HasTech"
                                                    />
                                                </div>
                                                <div className="swiper-slide image-zoom">
                                                    <img
                                                        src="assets/images/shop/details/single-product-3.jpg"
                                                        width={600}
                                                        height={700}
                                                        alt="Image-HasTech"
                                                    />
                                                </div>
                                                <div className="swiper-slide image-zoom">
                                                    <img
                                                        src="assets/images/shop/details/single-product-4.jpg"
                                                        width={600}
                                                        height={700}
                                                        alt="Image-HasTech"
                                                    />
                                                </div>
                                                <div className="swiper-slide image-zoom">
                                                    <img
                                                        src="assets/images/shop/details/single-product-5.jpg"
                                                        width={600}
                                                        height={700}
                                                        alt="Image-HasTech"
                                                    />
                                                </div>
                                            </div>
                                            <div className="swiper-pagination d-none" />
                                            <div className="swiper-button-prev d-none" />
                                            <div className="swiper-button-next d-none" />
                                        </div>
                                        {/* Product Image Slider End */}
                                        {/* Product Thumbnail Carousel Start */}
                                        <div className="product-thumb-carousel swiper">
                                            <div className="swiper-wrapper">
                                                <div className="swiper-slide">
                                                    <img
                                                        src="assets/images/shop/details/single-product-thumb-1.jpg"
                                                        alt="Image-HasTech"
                                                    />
                                                </div>
                                                <div className="swiper-slide">
                                                    <img
                                                        src="assets/images/shop/details/single-product-thumb-2.jpg"
                                                        alt="Image-HasTech"
                                                    />
                                                </div>
                                                <div className="swiper-slide">
                                                    <img
                                                        src="assets/images/shop/details/single-product-thumb-3.jpg"
                                                        alt="Image-HasTech"
                                                    />
                                                </div>
                                                <div className="swiper-slide">
                                                    <img
                                                        src="assets/images/shop/details/single-product-thumb-4.jpg"
                                                        alt="Image-HasTech"
                                                    />
                                                </div>
                                                <div className="swiper-slide">
                                                    <img
                                                        src="assets/images/shop/details/single-product-thumb-5.jpg"
                                                        alt="Image-HasTech"
                                                    />
                                                </div>
                                            </div>
                                            <div className="swiper-pagination d-none" />
                                            <div className="swiper-button-prev" />
                                            <div className="swiper-button-next" />
                                        </div>
                                        {/* Product Thumbnail Carousel End */}
                                    </div>
                                </div>
                                {/* Product Image End */}
                                {/* Product Content Start */}
                                <div className="col mb-4">
                                    <div className="single-product-content">
                                        <h3 className="single-product-title">
                                            1. New and sale badge product
                                        </h3>
                                        <div className="single-product-price">
                                            $110.00 <del>$130.00</del>
                                        </div>
                                        <ul className="single-product-meta">
                                            <li>
                                                <span className="label">SKU :</span>{" "}
                                                <span className="value">1110</span>
                                            </li>
                                            <li>
                                                <span className="label">Vendor :</span>{" "}
                                                <span className="value">Vendor 3</span>
                                            </li>
                                            <li>
                                                <span className="label">Type :</span>{" "}
                                                <span className="value">Type 3</span>
                                            </li>
                                            <li>
                                                <span className="label">Availability :</span>{" "}
                                                <span className="value">11 Left in Stock</span>
                                            </li>
                                        </ul>
                                        <div className="single-product-text">
                                            <p>
                                                Contrary to popular belief, Lorem Ipsum is not simply random
                                                text. It has roots in a piece of classical Latin literature from
                                                45 BC, making it over 2000 years old. Richard McClintock, a
                                                Latin professor at Hampden-Sydney College in Virginia,
                                            </p>
                                        </div>
                                        <ul className="single-product-variations">
                                            <li>
                                                <span className="label">Size :</span>
                                                <div className="value">
                                                    <div className="single-product-variation-size-wrap">
                                                        <div className="single-product-variation-size-item">
                                                            <input
                                                                type="radio"
                                                                name="size"
                                                                id="size-s"
                                                                defaultChecked=""
                                                            />
                                                            <label htmlFor="size-s">s</label>
                                                        </div>
                                                        <div className="single-product-variation-size-item">
                                                            <input type="radio" name="size" id="size-m" />
                                                            <label htmlFor="size-m">m</label>
                                                        </div>
                                                        <div className="single-product-variation-size-item">
                                                            <input type="radio" name="size" id="size-l" />
                                                            <label htmlFor="size-l">l</label>
                                                        </div>
                                                        <div className="single-product-variation-size-item">
                                                            <input type="radio" name="size" id="size-xl" />
                                                            <label htmlFor="size-xl">xl</label>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                            <li>
                                                <span className="label">Color :</span>
                                                <div className="value">
                                                    <div className="single-product-variation-color-wrap">
                                                        <div className="single-product-variation-color-item">
                                                            <input
                                                                type="radio"
                                                                name="color"
                                                                id="color-purple"
                                                                defaultChecked=""
                                                            />
                                                            <label
                                                                htmlFor="color-purple"
                                                                style={{ backgroundColor: "purple" }}
                                                            >
                                                                purple
                                                            </label>
                                                        </div>
                                                        <div className="single-product-variation-color-item">
                                                            <input type="radio" name="color" id="color-violet" />
                                                            <label
                                                                htmlFor="color-violet"
                                                                style={{ backgroundColor: "violet" }}
                                                            >
                                                                violet
                                                            </label>
                                                        </div>
                                                        <div className="single-product-variation-color-item">
                                                            <input type="radio" name="color" id="color-black" />
                                                            <label
                                                                htmlFor="color-black"
                                                                style={{ backgroundColor: "black" }}
                                                            >
                                                                black
                                                            </label>
                                                        </div>
                                                        <div className="single-product-variation-color-item">
                                                            <input type="radio" name="color" id="color-pink" />
                                                            <label
                                                                htmlFor="color-pink"
                                                                style={{ backgroundColor: "pink" }}
                                                            >
                                                                pink
                                                            </label>
                                                        </div>
                                                        <div className="single-product-variation-color-item">
                                                            <input type="radio" name="color" id="color-orange" />
                                                            <label
                                                                htmlFor="color-orange"
                                                                style={{ backgroundColor: "orange" }}
                                                            >
                                                                orange
                                                            </label>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                        </ul>
                                        <div className="single-product-additional-information">
                                            <button
                                                className="single-product-info-btn"
                                                data-bs-toggle="modal"
                                                data-bs-target="product-size-guide"
                                            >
                                                <i className="icon-equalizer" /> Size Guide
                                            </button>
                                            <button
                                                className="single-product-info-btn"
                                                data-bs-toggle="modal"
                                                data-bs-target="product-shipping-policy"
                                            >
                                                <i className="icon-plane" /> Shipping
                                            </button>
                                            <button
                                                className="single-product-info-btn"
                                                data-bs-toggle="modal"
                                                data-bs-target="product-enquiry"
                                            >
                                                <i className="icon-envelope" /> Ask About This product
                                            </button>
                                        </div>
                                        <div className="single-product-actions">
                                            <div className="single-product-actions-item">
                                                <div className="product-quantity-count">
                                                    <button className="dec qty-btn">-</button>
                                                    <input
                                                        className="product-quantity-box"
                                                        type="text"
                                                        name="quantity"
                                                        defaultValue={1}
                                                    />
                                                    <button className="inc qty-btn">+</button>
                                                </div>
                                            </div>
                                            <div className="single-product-actions-item">
                                                <button className="btn btn-cart">ADD TO CART</button>
                                            </div>
                                            <div className="single-product-actions-item">
                                                <button className="btn btn-icon ">
                                                    <i className="icon-heart" />
                                                </button>
                                            </div>
                                            <div className="single-product-actions-item">
                                                <button className="btn btn-icon">
                                                    <i className="icon-refresh" />
                                                </button>
                                            </div>
                                        </div>
                                        <div className="single-product-buy-now">
                                            <a href="#/" className="btn btn-buy-now">
                                                Buy it Now
                                            </a>
                                        </div>
                                        <ul className="single-product-meta">
                                            <li>
                                                <span className="label">Categories :</span>{" "}
                                                <span className="value links">
                                                    <a href="shop.html">Accessories</a>
                                                    <a href="shop.html">Deal Collections</a>
                                                    <a href="shop.html">New Products</a>
                                                    <a href="shop.html">Upsell Products</a>
                                                </span>
                                            </li>
                                            <li>
                                                <span className="label">Tags :</span>{" "}
                                                <span className="value links">
                                                    <a href="shop.html">black</a>
                                                    <a href="shop.html">fiber</a>
                                                    <a href="shop.html">leather</a>
                                                </span>
                                            </li>
                                            <li>
                                                <span className="label">Share :</span>{" "}
                                                <span className="value social">
                                                    <a href="#/">
                                                        <img
                                                            src="assets/images/icons/social/facebook.png"
                                                            alt="facebook"
                                                        />
                                                    </a>
                                                    <a href="#/">
                                                        <img
                                                            src="assets/images/icons/social/twitter.png"
                                                            alt="twitter"
                                                        />
                                                    </a>
                                                    <a href="#/">
                                                        <img
                                                            src="assets/images/icons/social/pinterest.png"
                                                            alt="pinterest"
                                                        />
                                                    </a>
                                                </span>
                                            </li>
                                        </ul>
                                        <div className="single-product-safe-payment">
                                            <p>Guaranteed safe checkout</p>
                                            <img src="assets/images/photos/payment.png" alt="payment" />
                                        </div>
                                    </div>
                                </div>
                                {/* Product Content End */}
                            </div>
                            {/* Single Product Top Area End */}
                            {/* Single Product Bottom (Description) Area Start */}
                            <div className="single-product-description-area">
                                <div className="nav single-product-description-area-nav">
                                    <button
                                        className="active"
                                        data-bs-toggle="tab"
                                        data-bs-target="#product-description"
                                    >
                                        Description
                                    </button>
                                    <button data-bs-toggle="tab" data-bs-target="#product-comments">
                                        Comments
                                    </button>
                                    <button data-bs-toggle="tab" data-bs-target="#product-reviews">
                                        Reviews
                                    </button>
                                    <button data-bs-toggle="tab" data-bs-target="#product-size-chart">
                                        Size Chart
                                    </button>
                                    <button
                                        data-bs-toggle="tab"
                                        data-bs-target="#product-shipping-policy"
                                    >
                                        Shipping Policy
                                    </button>
                                </div>
                                <div className="tab-content">
                                    {/* Description Start */}
                                    <div className="tab-pane fade show active" id="product-description">
                                        <div className="single-product-description">
                                            <p>
                                                Contrary to popular belief, Lorem Ipsum is not simply random
                                                text. It has roots in a piece of classical Latin literature from
                                                45 BC, making it over 2000 years old. Richard McClintock, a
                                                Latin professor at Hampden-Sydney College in Virginia, looked up
                                                one of the more obscure Latin words, consectetur, from a Lorem
                                                Ipsum passage, and going through the cites of the word in
                                                classical literature, discovered the undoubtable source. Lorem
                                                Ipsum comes from sections 1.10.32 and 1.10.33 of "de Finibus
                                                Bonorum et Malorum" (The Extremes of Good and Evil) by Cicero,
                                                written in 45 BC. This book is a treatise on the theory of
                                                ethics, very popular during the Renaissance. The first line of
                                                Lorem Ipsum, "Lorem ipsum dolor sit amet..", comes from a line
                                                in section 1.10.32.
                                            </p>
                                            <p>
                                                The standard chunk of Lorem Ipsum used since the 1500s is
                                                reproduced below for those interested. Sections 1.10.32 and
                                                1.10.33 from "de Finibus Bonorum et Malorum" by Cicero are also
                                                reproduced in their exact original form, accompanied by English
                                                versions from the 1914 translation by H. Rackham..
                                            </p>
                                        </div>
                                    </div>
                                    {/* Description End */}
                                    {/* Comments Start */}
                                    <div className="tab-pane fade" id="product-comments">
                                        <div className="block-title-2">
                                            <h4 className="title mb-4 fw-bold">Comments (2)</h4>
                                        </div>
                                        {/* Comment List Start */}
                                        <ul className="comment-list">
                                            <li>
                                                <div className="comment-item">
                                                    <div className="comment-thumb">
                                                        <img
                                                            src="assets/images/photos/client1.png"
                                                            alt="Image-HasTech"
                                                        />
                                                    </div>
                                                    <div className="comment-content">
                                                        <div className="comment-meta">
                                                            <h5 className="comment-name">Edna Watson</h5>
                                                            <span className="comment-date">November 27, 2023</span>
                                                        </div>
                                                        <p>
                                                            Thanks for always keeping your WordPress themes up to
                                                            date. Your level of support and dedication is second to
                                                            none.
                                                        </p>
                                                        <a href="#" className="comment-reply">
                                                            Reply
                                                        </a>
                                                    </div>
                                                </div>
                                                <ul className="comment-child">
                                                    <li>
                                                        <div className="comment-item">
                                                            <div className="comment-thumb">
                                                                <img
                                                                    src="assets/images/photos/client2.png"
                                                                    alt="Image-HasTech"
                                                                />
                                                            </div>
                                                            <div className="comment-content">
                                                                <div className="comment-meta">
                                                                    <h5 className="comment-name">Hester Perkins</h5>
                                                                    <span className="comment-date">
                                                                        November 27, 2023
                                                                    </span>
                                                                </div>
                                                                <p>
                                                                    Thanks for always keeping your WordPress themes up to
                                                                    date. Your level of support and dedication is second
                                                                    to none.
                                                                </p>
                                                                <a href="#" className="comment-reply">
                                                                    Reply
                                                                </a>
                                                            </div>
                                                        </div>
                                                    </li>
                                                </ul>
                                            </li>
                                        </ul>
                                        {/* Comment List End */}
                                        <div className="block-title-2">
                                            <h4 className="title mb-4 fw-bold">Leave your thought here</h4>
                                        </div>
                                        {/* Comment Form Start */}
                                        <div className="comment-form">
                                            <form action="#">
                                                <div className="row g-4">
                                                    <div className="col-sm-6">
                                                        <label htmlFor="comment-name">Name</label>
                                                        <input
                                                            className="form-field"
                                                            id="comment-name"
                                                            name="name"
                                                            type="text"
                                                            placeholder="Enter your name"
                                                        />
                                                    </div>
                                                    <div className="col-sm-6">
                                                        <label htmlFor="comment-email">Email</label>
                                                        <input
                                                            className="form-field"
                                                            id="comment-email"
                                                            name="email"
                                                            type="email"
                                                            placeholder="john.smith@example.com"
                                                        />
                                                    </div>
                                                    <div className="col-12">
                                                        <label htmlFor="comment-message">Message</label>
                                                        <textarea
                                                            className="form-field"
                                                            id="comment-message"
                                                            name="message"
                                                            placeholder="Write your messages here"
                                                            defaultValue={""}
                                                        />
                                                    </div>
                                                    <div className="col-12">
                                                        <input
                                                            type="submit"
                                                            className="btn btn-submit"
                                                            defaultValue="Submit"
                                                        />
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                        {/* Comment Form End */}
                                    </div>
                                    {/* Comments End */}
                                    {/* Reviews Start */}
                                    <div className="tab-pane fade" id="product-reviews">
                                        <div className="block-title-2">
                                            <h4 className="title fw-bold mb-4">Customer Reviews</h4>
                                        </div>
                                        {/* Review List Start */}
                                        <div className="review-list">
                                            <div className="review-item">
                                                <div className="review-thumb">
                                                    <img
                                                        src="assets/images/photos/client1.png"
                                                        alt="Image-HasTech"
                                                    />
                                                </div>
                                                <div className="review-content">
                                                    <div className="review-rating">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                    <div className="review-meta">
                                                        <h5 className="review-name">Edna Watson</h5>
                                                        <span className="review-date">November 27, 2023</span>
                                                    </div>
                                                    <p>
                                                        Thanks for always keeping your WordPress themes up to date.
                                                        Your level of support and dedication is second to none.
                                                    </p>
                                                </div>
                                            </div>
                                            <div className="review-item">
                                                <div className="review-thumb">
                                                    <img
                                                        src="assets/images/photos/client2.png"
                                                        alt="Image-HasTech"
                                                    />
                                                </div>
                                                <div className="review-content">
                                                    <div className="review-rating">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                    <div className="review-meta">
                                                        <h5 className="review-name">Hester Perkins</h5>
                                                        <span className="review-date">November 27, 2023</span>
                                                    </div>
                                                    <p>
                                                        Thanks for always keeping your WordPress themes up to date.
                                                        Your level of support and dedication is second to none.
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                        {/* Review List End */}
                                        <div className="block-title-2">
                                            <h4 className="title fw-bold mb-4">Write a review</h4>
                                        </div>
                                        {/* Review Form Start */}
                                        <div className="review-form">
                                            <form action="#">
                                                <div className="row g-4">
                                                    <div className="col-12">
                                                        <label htmlFor="review-rating">Rating</label>
                                                        <select
                                                            className="form-field"
                                                            name="rating"
                                                            id="review-rating"
                                                        >
                                                            <option value={1}>One</option>
                                                            <option value={2}>Two</option>
                                                            <option value={3}>Three</option>
                                                            <option value={4}>Four</option>
                                                            <option value={5}>Five</option>
                                                        </select>
                                                    </div>
                                                    <div className="col-sm-6">
                                                        <label htmlFor="review-name">Name</label>
                                                        <input
                                                            className="form-field"
                                                            id="review-name"
                                                            name="name"
                                                            type="text"
                                                            placeholder="Enter your name"
                                                        />
                                                    </div>
                                                    <div className="col-sm-6">
                                                        <label htmlFor="review-email">Email</label>
                                                        <input
                                                            className="form-field"
                                                            id="review-email"
                                                            name="email"
                                                            type="email"
                                                            placeholder="john.smith@example.com"
                                                        />
                                                    </div>
                                                    <div className="col-12">
                                                        <label htmlFor="review-comment">
                                                            Body of Review (1500)
                                                        </label>
                                                        <textarea
                                                            className="form-field"
                                                            id="review-comment"
                                                            name="comment"
                                                            placeholder="Write your comments here"
                                                            defaultValue={""}
                                                        />
                                                    </div>
                                                    <div className="col-12">
                                                        <input
                                                            type="submit"
                                                            className="btn btn-submit"
                                                            defaultValue="Submit Review"
                                                        />
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                        {/* Review Form End */}
                                    </div>
                                    {/* Reviews End */}
                                    {/* Size Chart Start */}
                                    <div className="tab-pane fade" id="product-size-chart">
                                        <table className="table table-bordered">
                                            <tbody>
                                                <tr>
                                                    <td className="cun-name">
                                                        <span>UK</span>
                                                    </td>
                                                    <td>18</td>
                                                    <td>20</td>
                                                    <td>22</td>
                                                    <td>24</td>
                                                    <td>26</td>
                                                </tr>
                                                <tr>
                                                    <td className="cun-name">
                                                        <span>European</span>
                                                    </td>
                                                    <td>46</td>
                                                    <td>48</td>
                                                    <td>50</td>
                                                    <td>52</td>
                                                    <td>54</td>
                                                </tr>
                                                <tr>
                                                    <td className="cun-name">
                                                        <span>usa</span>
                                                    </td>
                                                    <td>14</td>
                                                    <td>16</td>
                                                    <td>18</td>
                                                    <td>20</td>
                                                    <td>22</td>
                                                </tr>
                                                <tr>
                                                    <td className="cun-name">
                                                        <span>Australia</span>
                                                    </td>
                                                    <td>28</td>
                                                    <td>10</td>
                                                    <td>12</td>
                                                    <td>14</td>
                                                    <td>16</td>
                                                </tr>
                                                <tr>
                                                    <td className="cun-name">
                                                        <span>Canada</span>
                                                    </td>
                                                    <td>24</td>
                                                    <td>18</td>
                                                    <td>14</td>
                                                    <td>42</td>
                                                    <td>36</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    {/* Size Chart End */}
                                    {/* Shipping Policy Start */}
                                    <div className="tab-pane fade" id="product-shipping-policy">
                                        <div className="block-title-2">
                                            <h4 className="title fw-bold mb-4">
                                                Shipping policy of our store
                                            </h4>
                                        </div>
                                        <p>
                                            Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
                                            nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam
                                            erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci
                                            tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo
                                            consequat. Duis autem vel eum iriure dolor in hendrerit in
                                            vulputate
                                        </p>
                                        <ul>
                                            <li>1-2 business days (Typically by end of day)</li>
                                            <li>30 days money back guaranty</li>
                                            <li>24/7 live support</li>
                                            <li>odio dignissim qui blandit praesent</li>
                                            <li>luptatum zzril delenit augue duis dolore</li>
                                            <li>te feugait nulla facilisi.</li>
                                        </ul>
                                        <p>
                                            Nam liber tempor cum soluta nobis eleifend option congue nihil
                                            imperdiet doming id quod mazim placerat facer possim assum. Typi
                                            non habent claritatem insitam; est usus legentis in iis qui facit
                                            eorum
                                        </p>
                                        <p>
                                            claritatem. Investigationes demonstraverunt lectores legere me
                                            lius quod ii legunt saepius. Claritas est etiam processus
                                            dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum
                                            est notare quam littera gothica, quam nunc putamus parum claram,
                                            anteposuerit litterarum formas humanitatis per
                                        </p>
                                        <p>
                                            seacula quarta decima et quinta decima. Eodem modo typi, qui nunc
                                            nobis videntur parum clari, fiant sollemnes in futurum.
                                        </p>
                                    </div>
                                    {/* Shipping Policy End */}
                                </div>
                            </div>
                            {/* Single Product Bottom (Description) Area End */}
                        </div>
                    </div>
                    {/*== End Product Detail Area Wrapper ==*/}
                    {/*== Start Product Area Wrapper ==*/}
                    <div className="product-area section-bottom-space position-relative">
                        <div className="container">
                            <div className="section-title text-center">
                                <h5 className="sub-title text-uppercase text-primary mt-n1">
                                    Awesome Products
                                </h5>
                                <h2 className="title mb-0 mt-n2">Related Products</h2>
                            </div>
                            <div className="swiper-container-wrap swiper-button-style swiper-button-nav14">
                                {/*== Start Swiper Navigation ==*/}
                                <div className="swiper-button-prev" />
                                <div className="swiper-button-next" />
                                <div className="swiper product-slider-container swiper-shadow-space">
                                    <div className="swiper-wrapper">
                                        <div className="swiper-slide">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <a
                                                        className="product-item-thumb"
                                                        href="shop-single-product.html"
                                                    >
                                                        <img
                                                            src="assets/images/shop/1.jpg"
                                                            width={268}
                                                            height={313}
                                                            alt="Image-HasTech"
                                                        />
                                                    </a>
                                                    <span className="label">Sale</span>
                                                    <span className="label label-two">-15%</span>
                                                    <span className="label label-new">New</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">
                                                            1. New and sale badge product
                                                        </a>
                                                    </h5>
                                                    <div className="product-item-price">
                                                        <span className="price-old">$130.00</span> $110.00
                                                    </div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="swiper-slide">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <div
                                                        className="tab-content product-item-tab-content"
                                                        id="productItem22-tabContent"
                                                    >
                                                        <div
                                                            className="tab-pane fade show active"
                                                            id="product-item1"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item1-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/2.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                        <div
                                                            className="tab-pane fade"
                                                            id="product-item2"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item2-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/3.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                        <div
                                                            className="tab-pane fade"
                                                            id="product-item3"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item3-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/4.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                    </div>
                                                    <div
                                                        className="nav nav-tabs product-item-tab-btn"
                                                        id="productItem22-tab"
                                                        role="tablist"
                                                    >
                                                        <button
                                                            className="nav-link active"
                                                            id="product-item1-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item1"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item1"
                                                            aria-selected="true"
                                                            data-bg-img="assets/images/shop/2.jpg"
                                                        />
                                                        <button
                                                            className="nav-link"
                                                            id="product-item2-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item2"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item2"
                                                            aria-selected="false"
                                                            data-bg-img="assets/images/shop/3.jpg"
                                                        />
                                                        <button
                                                            className="nav-link"
                                                            id="product-item3-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item3"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item3"
                                                            aria-selected="false"
                                                            data-bg-img="assets/images/shop/4.jpg"
                                                        />
                                                    </div>
                                                    <span className="label">Sale</span>
                                                    <span className="label label-two">-10%</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">
                                                            10. This is the large title
                                                        </a>
                                                    </h5>
                                                    <div className="product-item-price">
                                                        <span className="price-old">$21.00</span> $19.00
                                                    </div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="swiper-slide">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <div
                                                        className="tab-content product-item-tab-content"
                                                        id="productItem23-tabContent"
                                                    >
                                                        <div
                                                            className="tab-pane fade show active"
                                                            id="product-item4"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item4-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/3.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                        <div
                                                            className="tab-pane fade"
                                                            id="product-item5"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item5-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/4.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                        <div
                                                            className="tab-pane fade"
                                                            id="product-item6"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item6-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/5.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                    </div>
                                                    <div
                                                        className="nav nav-tabs product-item-tab-btn"
                                                        id="productItem23-tab"
                                                        role="tablist"
                                                    >
                                                        <button
                                                            className="nav-link active"
                                                            id="product-item4-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item4"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item4"
                                                            aria-selected="true"
                                                            data-bg-img="assets/images/shop/3.jpg"
                                                        />
                                                        <button
                                                            className="nav-link"
                                                            id="product-item5-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item5"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item5"
                                                            aria-selected="false"
                                                            data-bg-img="assets/images/shop/4.jpg"
                                                        />
                                                        <button
                                                            className="nav-link"
                                                            id="product-item6-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item6"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item6"
                                                            aria-selected="false"
                                                            data-bg-img="assets/images/shop/5.jpg"
                                                        />
                                                    </div>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">
                                                            11. Product with video
                                                        </a>
                                                    </h5>
                                                    <div className="product-item-price"> $39.00</div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="swiper-slide">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <div
                                                        className="tab-content product-item-tab-content"
                                                        id="productItem24-tabContent"
                                                    >
                                                        <div
                                                            className="tab-pane fade show active"
                                                            id="product-item7"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item7-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/4.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                        <div
                                                            className="tab-pane fade"
                                                            id="product-item8"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item8-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/5.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                        <div
                                                            className="tab-pane fade"
                                                            id="product-item9"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item9-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/6.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                    </div>
                                                    <div
                                                        className="nav nav-tabs product-item-tab-btn"
                                                        id="productItem24-tab"
                                                        role="tablist"
                                                    >
                                                        <button
                                                            className="nav-link active"
                                                            id="product-item7-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item7"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item7"
                                                            aria-selected="true"
                                                            data-bg-img="assets/images/shop/4.jpg"
                                                        />
                                                        <button
                                                            className="nav-link"
                                                            id="product-item8-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item8"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item8"
                                                            aria-selected="false"
                                                            data-bg-img="assets/images/shop/5.jpg"
                                                        />
                                                        <button
                                                            className="nav-link"
                                                            id="product-item9-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item9"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item9"
                                                            aria-selected="false"
                                                            data-bg-img="assets/images/shop/6.jpg"
                                                        />
                                                    </div>
                                                    <span className="label">Sale</span>
                                                    <span className="label label-two">-11%</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">
                                                            10. This is the large title
                                                        </a>
                                                    </h5>
                                                    <div className="product-item-price">
                                                        <span className="price-old">$21.00</span> $19.00
                                                    </div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="swiper-slide">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <a
                                                        className="product-item-thumb"
                                                        href="shop-single-product.html"
                                                    >
                                                        <img
                                                            src="assets/images/shop/5.jpg"
                                                            width={268}
                                                            height={313}
                                                            alt="Image-HasTech"
                                                        />
                                                    </a>
                                                    <span className="label label-new">New</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">2. New badge product</a>
                                                    </h5>
                                                    <div className="product-item-price">$80.00</div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="swiper-slide">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <a
                                                        className="product-item-thumb"
                                                        href="shop-single-product.html"
                                                    >
                                                        <img
                                                            src="assets/images/shop/6.jpg"
                                                            width={268}
                                                            height={313}
                                                            alt="Image-HasTech"
                                                        />
                                                    </a>
                                                    <span className="label">Sale</span>
                                                    <span className="label label-two">-18%</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">3. Variable product</a>
                                                    </h5>
                                                    <div className="product-item-price">
                                                        <span className="price-old">$85.00</span> $70.00
                                                    </div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="swiper-slide">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <a
                                                        className="product-item-thumb"
                                                        href="shop-single-product.html"
                                                    >
                                                        <img
                                                            src="assets/images/shop/7.jpg"
                                                            width={268}
                                                            height={313}
                                                            alt="Image-HasTech"
                                                        />
                                                    </a>
                                                    <span className="label">Soldout</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                    <div className="countdown1" data-countdown="2025/01/05" />
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">4. Soldout product</a>
                                                    </h5>
                                                    <div className="product-item-price">
                                                        <span className="price-old">$29.00</span> $19.00
                                                    </div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="swiper-slide">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <a
                                                        className="product-item-thumb"
                                                        href="shop-single-product.html"
                                                    >
                                                        <img
                                                            src="assets/images/shop/8.jpg"
                                                            width={268}
                                                            height={313}
                                                            alt="Image-HasTech"
                                                        />
                                                    </a>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">5. Simple product</a>
                                                    </h5>
                                                    <div className="product-item-price">$50.00</div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    {/*== End Product Area Wrapper ==*/}
                </main>

            </div>
        </>
    )
}

export default ProductDetails;